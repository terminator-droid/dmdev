package com.dudev.oop.hometask;

public class House {
    final private int number;
    final private Floor[] floors;

    House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    public void print() {
        System.out.println("Дом " + this.number + ", количество этажей " + this.floors.length);
    }

    void printAllInformation() {
        this.print();
        for (Floor floor : floors) {
            floor.print();
            for (Apartment apartment : floor.getApartments()) {
                apartment.print();
                for (Room room : apartment.getRooms()) {
                    room.print();
                }
            }
        }
    }
}
