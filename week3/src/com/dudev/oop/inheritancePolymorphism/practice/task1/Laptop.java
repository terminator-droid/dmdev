package com.dudev.oop.inheritancePolymorphism.practice.task1;

public class Laptop extends Computer {
    private int weight;

    public Laptop(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }

//    @Override
//    public void print() {
//        System.out.println("Print");
//    }

    public void open() {
        System.out.println("Я открылся");
    }

    @Override
    public void load() {
        System.out.println("Я загрузился");
    }
}
