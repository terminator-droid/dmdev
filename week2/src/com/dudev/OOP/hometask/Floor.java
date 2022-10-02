package com.dudev.OOP.hometask;

public class Floor {
    int number;
    Apartment[] apartments;

    Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    void print() {
        System.out.println("Этаж " + this.number + ", количество квартир " + this.apartments.length);
    }
}
