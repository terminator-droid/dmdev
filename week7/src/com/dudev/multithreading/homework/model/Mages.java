package com.dudev.multithreading.homework.model;

import com.dudev.multithreading.homework.util.CrystalConst;

import java.util.List;

public enum Mages {
    FIRE_MAGES,
    WATER_MAGES;

    private int numberOfWhiteCrystals;
    private int numberOfRedCrystals;
    private boolean isWinner;

    public void getCrystals(List<Crystal> crystals) {
        for (Crystal crystal : crystals) {
            if (crystal.equals(Crystal.RED)) {
                numberOfRedCrystals++;
            } else {
                numberOfWhiteCrystals++;
            }
        }
        if (numberOfRedCrystals >= CrystalConst.NEEDED_CRYSTAL_NUMBER
                && numberOfWhiteCrystals >= CrystalConst.NEEDED_CRYSTAL_NUMBER) {
            isWinner = true;
        }
    }

    public static Mages getWinner() {
        return FIRE_MAGES.isWinner
                ? FIRE_MAGES
                : WATER_MAGES;
    }

    public static boolean hasWinner() {
        return FIRE_MAGES.isWinner() || WATER_MAGES.isWinner();
    }

    public boolean isWinner() {
        return isWinner;
    }

    public int getNumberOfWhiteCrystals() {
        return numberOfWhiteCrystals;
    }

    public int getNumberOfRedCrystals() {
        return numberOfRedCrystals;
    }
}
