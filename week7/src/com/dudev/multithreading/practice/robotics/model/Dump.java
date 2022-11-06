package com.dudev.multithreading.practice.robotics.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Dump {

    private final Lock lock = new ReentrantLock();
    private final List<Detail> detailsInDump = new LinkedList<>();

    public Dump(List<Detail> initialDetails) {
        detailsInDump.addAll(initialDetails);
    }

    public void add(Detail detail) {
        detailsInDump.add(detail);
    }

    public Detail remove(int index) {
        return detailsInDump.remove(index);
    }

    public List<Detail> removeAll() {
        ArrayList<Detail> details = new ArrayList<>(detailsInDump);
        detailsInDump.clear();
        return details;
    }

    public int size() {
        return detailsInDump.size();
    }

    public boolean isEmpty() {
        return detailsInDump.isEmpty();
    }

    public Lock getLock() {
        return lock;
    }
}
