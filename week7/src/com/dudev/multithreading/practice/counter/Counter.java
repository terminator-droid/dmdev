package com.dudev.multithreading.practice.counter;

public class Counter {
    private int count;


    public void increment() {
        count++;
    }
    public void decrerment() {
        count--;
    }

    public int getCount() {
        return count;
    }
}
