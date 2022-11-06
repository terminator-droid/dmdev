package com.dudev.multithreading.practice.queue;

public class Cashbox {

    private static int generator = 1;
    private int id;

    @Override
    public String toString() {
        return "Cashbox{" +
                "id=" + id +
                '}';
    }

    public Cashbox() {
        this.id = generator++;
    }
}
