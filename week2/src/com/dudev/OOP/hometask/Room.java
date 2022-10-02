package com.dudev.OOP.hometask;

public class Room {
    boolean isPassage;

    Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    void print() {
        if (this.isPassage) {
            System.out.println("Комната проходная");
        } else {
            System.out.println("Комната не проходная");
        }
    }
}
