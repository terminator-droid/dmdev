package com.dudev.oop.hometask;

public class Apartment {
    final private int number;
    final private Room[] rooms;

    Apartment(int number, Room[] rooms) {
        this.number = number;
        this.rooms = rooms;
    }

    public Room[] getRooms() {
        return rooms;
    }

    public void print() {
        System.out.println("Квартира номер " + this.number + ", количество комнат " + this.rooms.length);
    }
}
