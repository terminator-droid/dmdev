package com.dudev.OOP.hometask;

public class House {
    int number;
    Floor[] floors;

    House(int number, Floor[] floors) {
        this.number = number;
        this.floors = floors;
    }

    void print() {
        System.out.println("Дом " + this.number + ", количество этажей " + this.floors.length);
    }

    void printAllInformation() {
        this.print();
        for (Floor floor : floors) {
            floor.print();
            for (Apartment apartment : floor.apartments) {
                apartment.print();
                for (Room room : apartment.rooms) {
                    room.print();
                }
            }
        }
    }
}
