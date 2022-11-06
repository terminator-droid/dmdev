package com.dudev.multithreading.homework.model;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class CrystalPlanet {

    private final Lock lock = new ReentrantLock();
    private final List<Crystal> crystals = new LinkedList<>();

    public CrystalPlanet() {
    }

    public void growCrystal(Crystal crystal) {
        crystals.add(crystal);
    }

    public Crystal removeCrystal(int index) {
        return crystals.remove(index);
    }

    public List<Crystal> removeALlCrystals() {
        ArrayList<Crystal> currentCrystals = new ArrayList<>(crystals);
        crystals.clear();
        return currentCrystals;
    }

    public Lock getLock() {
        return lock;
    }

    public boolean isEmpty() {
        return crystals.isEmpty();
    }

    public int size() {
        return crystals.size();
    }
}
