package com.dudev.multithreading.homework.threads;

import com.dudev.multithreading.homework.model.Crystal;
import com.dudev.multithreading.homework.model.CrystalPlanet;
import com.dudev.multithreading.homework.model.Mages;
import com.dudev.multithreading.homework.util.CrystalConst;
import com.dudev.multithreading.homework.util.RandomUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MageRocket extends Thread {

    private final Day day;
    private final Mages mages;
    private final CrystalPlanet crystalPlanet;

    public MageRocket(Day day, Mages mages, CrystalPlanet crystalPlanet) {
        this.day = day;
        this.mages = mages;
        this.crystalPlanet = crystalPlanet;
    }

    @Override
    public void run() {
        while (!Mages.hasWinner()) {
            try {
                mages.getCrystals(mineCrystals());
                waitNextDay();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.printf("\nПобедили маги %s", Mages.getWinner().name());
    }

    private List<Crystal> mineCrystals() {
        int crystalsToGet = RandomUtil.getRandomIntInBoundaries(CrystalConst.MINIMUM_CRYSTAL_NUMBER
                , CrystalConst.MAXIMUM_CRYSTAL_NUMBER);
        List<Crystal> crystalsGot = new ArrayList<>();
        synchronized (crystalPlanet.getLock()) {
            if (crystalPlanet.size() <= crystalsToGet) {
                crystalsGot = crystalPlanet.removeALlCrystals();
            } else if (!crystalPlanet.isEmpty()) {
                for (int i = 0; i < crystalsToGet; i++) {
                    crystalsGot.add(crystalPlanet.removeCrystal(RandomUtil.getRandomInt(crystalPlanet.size())));
                }
            }
            System.out.printf("\nУ %s магов %d красных кристаллов, %d белых кристаллов", mages.name(),
                    mages.getNumberOfRedCrystals(), mages.getNumberOfWhiteCrystals());
            System.out.printf("\nМаги %s добыли следующие кристаллы:", mages.name());
            crystalsGot.stream()
                    .collect(Collectors.toMap(Function.identity(), crystal -> 1, Integer::sum))
                    .forEach((k, v) -> System.out.printf("\n%s - %s", k, v));
        }
        return crystalsGot;
    }

    private void waitNextDay() throws InterruptedException {
        synchronized (day.getLock()) {
            day.getLock().wait();
        }
    }
}
