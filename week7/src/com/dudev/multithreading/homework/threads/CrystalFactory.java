package com.dudev.multithreading.homework.threads;

import com.dudev.multithreading.homework.model.Crystal;
import com.dudev.multithreading.homework.model.CrystalPlanet;
import com.dudev.multithreading.homework.model.Mages;
import com.dudev.multithreading.homework.util.CrystalConst;
import com.dudev.multithreading.homework.util.RandomUtil;

public class CrystalFactory extends Thread {

    private final CrystalPlanet crystalPlanet;
    private final Day day;

    public CrystalFactory(CrystalPlanet crystalPlanet, Day day) {
        this.crystalPlanet = crystalPlanet;
        this.day = day;
    }

    @Override
    public void run() {
        while (!Mages.hasWinner()) {
            try {
                growCrystals();
                waitNextDay();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void growCrystals() {
        int numberOfCrystals = RandomUtil.getRandomIntInBoundaries(CrystalConst.MINIMUM_CRYSTAL_NUMBER, CrystalConst.MAXIMUM_CRYSTAL_NUMBER);
        synchronized (crystalPlanet.getLock()) {
            for (int i = 0; i < numberOfCrystals; i++) {
                crystalPlanet.growCrystal(Crystal.values()[RandomUtil.getRandomInt(Crystal.values().length)]);
            }
        }
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }
}