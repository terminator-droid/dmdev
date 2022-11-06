package com.dudev.multithreading.practice.robotics.thread;

import com.dudev.multithreading.practice.robotics.model.Detail;
import com.dudev.multithreading.practice.robotics.model.DetailsUtil;
import com.dudev.multithreading.practice.robotics.model.Dump;
import com.dudev.multithreading.practice.robotics.util.NightConst;
import com.dudev.multithreading.practice.robotics.util.RandomUtil;

import java.util.Collections;
import java.util.List;

public class Factory extends Thread {

    private static final int MAX_DETAILS_COUNT = 4;
    private final Dump dump;
    private final Night night;

    public Factory(Night night) {
        this(Collections.EMPTY_LIST, night);
    }

    public Factory(List<Detail> initialDetails, Night night) {
        this.dump = new Dump(initialDetails);
        this.night = night;
    }

    private void addDetailsToDump() {
        int numberOfDetailsToAdd = RandomUtil.getRandomIntWithoutZero(MAX_DETAILS_COUNT);
        synchronized (dump.getLock()) {
            for (int i = 0; i < numberOfDetailsToAdd; i++) {
                Detail detail = Detail.values()[RandomUtil.getRandomInt(Detail.values().length)];
                dump.add(detail);
            }
        }
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHTS; i++) {
                addDetailsToDump();
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
