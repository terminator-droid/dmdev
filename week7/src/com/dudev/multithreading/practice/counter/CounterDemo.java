package com.dudev.multithreading.practice.counter;

public class CounterDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        CounterThread counterThread = new CounterThread(counter);
        CounterThread counterThread1 = new CounterThread(counter);
        CounterThread counterThread2 = new CounterThread(counter);
        CounterThread counterThread3 = new CounterThread(counter);
        counterThread.start();
        counterThread1.start();
        counterThread2.start();
        counterThread3.start();
        try {
            counterThread.join();
            counterThread1.join();
            counterThread2.join();
            counterThread3.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(counter.getCount());
    }
}
