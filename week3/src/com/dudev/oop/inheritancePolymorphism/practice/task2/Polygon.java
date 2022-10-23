package com.dudev.oop.inheritancePolymorphism.practice.task2;

public abstract class Polygon implements Figurable {
    private int angleNumber;

    public Polygon(int angleNumber) {
        this.angleNumber = angleNumber;

    }

    abstract protected void initializePoints();

    abstract protected void initializeSides();

    abstract public Side[] getListOfSides();
}
