package com.dudev.multithreading.practice.robotics.thread;

import com.dudev.multithreading.practice.robotics.model.Detail;
import com.dudev.multithreading.practice.robotics.model.Dump;
import com.dudev.multithreading.practice.robotics.model.Scientist;
import com.dudev.multithreading.practice.robotics.util.NightConst;
import com.dudev.multithreading.practice.robotics.util.RandomUtil;
import com.dudev.multithreading.practice.robotics.util.ThreadUtil;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Assistant extends Thread {

    private static final int MAX_DETAILS_TO_GET = 4;
    private final Night night;
    private final Scientist scientist;
    private final Dump dump;

    public Assistant(Night night, Scientist scientist, Dump dump) {
        this.night = night;
        this.scientist = scientist;
        this.dump = dump;
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < NightConst.AMOUNT_OF_NIGHTS; i++) {
                List<Detail> detailsFromFactory = getDetailsFromFactory();
                scientist.getRobotDetails(detailsFromFactory);
                waitNextNight();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private List<Detail> getDetailsFromFactory() {
        List<Detail> detailsGot = new ArrayList<>(MAX_DETAILS_TO_GET);
        int detailsGotNumber = RandomUtil.getRandomIntWithoutZero(MAX_DETAILS_TO_GET);
        synchronized (dump.getLock()) {
            if (dump.size() <= detailsGotNumber) {
                detailsGot.addAll(dump.removeAll());
            } else if (!dump.isEmpty()) {
                for (int i = 0; i < detailsGotNumber; i++) {
                    detailsGot.add(dump.remove(RandomUtil.getRandomInt(dump.size())));
                }
            }
            System.out.printf("%s assistant got next details: %s%n", scientist.getName(), detailsGot);
        }
        return detailsGot;
    }

    private void waitNextNight() throws InterruptedException {
        synchronized (night.getLock()) {
            night.getLock().wait();
        }
    }
}
