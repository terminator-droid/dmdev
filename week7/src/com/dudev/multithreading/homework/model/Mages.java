package com.dudev.multithreading.homework.model;

import com.dudev.multithreading.homework.util.CrystalConst;

import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

public class Mages {

    private static AtomicBoolean  hasWinner = new AtomicBoolean();

    private final Race race;
    private final Map<Crystal, Integer> crystals = new EnumMap<Crystal, Integer>(Crystal.class);
    private AtomicBoolean isWinner = new AtomicBoolean();

    public Mages(Race race) {
        this.race = race;
    }

    public void getCrystals(List<Crystal> crystalsCurrent) {
        crystalsCurrent.forEach((crystal -> crystals.merge(crystal, 1, Integer::sum)));
        winnerCheckAndSet();
    }

    private void winnerCheckAndSet() {
        if (crystals.values().stream().filter(number -> number > CrystalConst.NEEDED_CRYSTAL_NUMBER).toList().size() == 2) {
            isWinner.set(true);
            hasWinner.set(true);
        }
    }

    public static boolean hasWinner() {
        return hasWinner.get();
    }

    public Race getRace() {
        return race;
    }

    public boolean isWinner() {
        return isWinner.get();
    }

    @Override
    public String toString() {
        return "crystals=" + crystals +
                '}';
    }
}
