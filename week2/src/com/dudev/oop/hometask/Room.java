package com.dudev.oop.hometask;

public class Room {
    final private boolean isPassage;

    Room(boolean isPassage) {
        this.isPassage = isPassage;
    }

    public void print() {
        if (this.isPassage) {
            System.out.println("Комната проходная");
        } else {
            System.out.println("Комната не проходная");
        }
    }
}
