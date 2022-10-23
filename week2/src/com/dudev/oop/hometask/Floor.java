package com.dudev.oop.hometask;

public class Floor {
    final private int number;
    final private Apartment[] apartments;

    Floor(int number, Apartment[] apartments) {
        this.number = number;
        this.apartments = apartments;
    }

    public Apartment[] getApartments() {
        return apartments;
    }

    public void print() {
        System.out.println("Этаж " + this.number + ", количество квартир " + this.apartments.length);
    }
}
