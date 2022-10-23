package com.dudev.oop.inheritancePolymorphism.practice.task1;

public abstract class Computer implements Printable{
    Ram ram;
    Ssd ssd;


    public Computer(Ram ram, Ssd ssd) {
        this.ram = ram;
        this.ssd = ssd;
    }
    @Override
    public void print(){
        System.out.println("Принт");
    }
    public void printInformation() {
        System.out.println("В данном компьютере ram = " + ram.getValue() + " и ssd = " + ssd.getValue());
    }
    public abstract void load();
}
