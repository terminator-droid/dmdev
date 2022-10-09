package com.dudev.oop.inheritancePolymorphism.homework;

public class Coordinates implements Printable {
    private double x;
    private double y;
    private double z;


    public Coordinates(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setCoordinates(Coordinates coordinates) {
        setX(coordinates.getX());
        setY(coordinates.getY());
        setZ(coordinates.getZ());
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    @Override
    public String toString() {
        return String.format("%f, %f, %f", x, y, z) ;
    }

    @Override
    public void printInformation() {
        System.out.printf("Координаты объекта: (%f; %f; %f) %n", x, y, z);
    }
}
