package com.dudev.oop.inheritancePolymorphism.practice.task2;

public class Point implements Printable {
    private int x;
    private int y;
    private String name;

    public Point(int x, int y, String name) {
        this.x = x;
        this.y = y;
        this.name = name;
    }

    public Point setName(String name) {
        this.name = name;
        return null;
    }

    public String getName() {
        return name;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance(Point point) {
        return Math.sqrt(Math.pow(x - point.x, 2) + Math.pow(y - point.y, 2));
    }

    @Override
    public void printInformation() {
        System.out.printf("Точка %s с координатами %d, %d%n", getName(), x, y);
    }
}