package com.dudev.OOP.hometask;

public class Apartment {
    int number;
    Room[] rooms;

    Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    void print() {
        System.out.println("Квартира номер " + this.number + ", количество комнат " + this.rooms.length);
    }
}
