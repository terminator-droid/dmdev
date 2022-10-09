package com.dudev.oop.inheritancePolymorphism.practice.task1;

public class ComputerRunner {
    public static void main(String[] args) {
        Computer laptop = new Laptop(new Ram(250), new Ssd(1024));
        Computer mobile = new Mobile(new Ram(300), new Ssd(512));
        mobile.load();
        Laptop laptop1 = new Laptop(new Ram(1), new Ssd(123));
        laptop.printInformation();
        loadComputerInformation(laptop, mobile);
    }

    private static void loadComputerInformation(Computer... computers) {
        for (Computer computer : computers) {
            if (computer instanceof Laptop) {
                ((Laptop) computer).open();
            } else if (computer instanceof Mobile) {
                ((Mobile) computer).reboot();
            }
        }
    }
}
