package com.dudev.multithreading.homework.threads;

import com.dudev.multithreading.homework.model.Mages;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Day extends Thread {

    private static final int DAY_PERIOD = 100;
    private final Lock lock = new ReentrantLock();
    private int dayCounter;

    @Override
    public void run() {
        while (!Mages.hasWinner()) {
            synchronized (lock) {
                try {
                    System.out.print("\n------------");
                    System.out.printf("\nИдет день %d", dayCounter);
                    System.out.print("\n------------");
                    dayCounter++;
                    lock.notifyAll();
                    lock.wait(DAY_PERIOD);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
        synchronized (lock) {
            lock.notifyAll();
        }
    }

    public Lock getLock() {
        return lock;
    }
}
