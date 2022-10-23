package com.dudev.oop.inheritancePolymorphism.homework;

public class SpaceRunner {
    public static void main(String[] args) {
        Planet saturn = new Planet(1000, 5, 100, 34, new Coordinates(10, 10, 10), "Сатурн",
                new Planet.Ring[] {new Planet.Ring("Серебряное")});
        Star sun = new Star(100000, 1000, 500, 30, new Coordinates(10000, 30000, 1333), new Planet[]{saturn}, "Солнце");
        sun.printInformation();
        sun.move(1, 10);
        sun.printInformation();
        saturn.isСollided(sun);
    }
}
