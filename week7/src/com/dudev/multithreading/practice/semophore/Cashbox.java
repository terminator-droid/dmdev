package com.dudev.multithreading.practice.semophore;

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
