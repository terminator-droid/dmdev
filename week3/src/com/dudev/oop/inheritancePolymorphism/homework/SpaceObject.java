package com.dudev.oop.inheritancePolymorphism.homework;

public abstract class SpaceObject implements Gravitational, Printable{

    protected final double mass;
    protected final double speed;
    protected Coordinates coordinates;

    public SpaceObject(double mass, double speed, Coordinates coordinates) {
        this.mass = mass;
        this.speed = speed;
        this.coordinates = coordinates;
    }

    public boolean isMassEqual(SpaceObject spaceObject) {
        return mass == spaceObject.mass;
    }
    @Override
    public double getDistance(SpaceObject spaceObject) {
        return Math.sqrt(Math.pow(coordinates.getX() - spaceObject.coordinates.getX(), 2) + Math.pow(coordinates.getY() - spaceObject.coordinates.getY(), 2) + Math.pow(coordinates.getZ() - spaceObject.coordinates.getZ(), 2));
    }


    public Coordinates getCoordinates() {
        return coordinates;
    }

    public double getMass() {
        return mass;
    }

    public double getSpeed() {
        return speed;
    }
}
