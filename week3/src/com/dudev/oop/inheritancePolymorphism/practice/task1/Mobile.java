package com.dudev.oop.inheritancePolymorphism.practice.task1;

public class Mobile extends Computer{
    public Mobile(Ram ram, Ssd ssd) {
        super(ram, ssd);
    }
//    @Override
//    public void print(){
//        System.out.println("Принт_1");
//    }
    public void reboot() {
        System.out.println("Я перезагрузился");
    }
    @Override
    public void load() {
        System.out.println("Я включился");
    }
}
