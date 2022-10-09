package com.dudev.oop.inheritancePolymorphism.homework;

import static com.dudev.oop.inheritancePolymorphism.homework.SpaceUtils.GRAVITATIONAL_CONSTANT;

public abstract class NaturalSpaceObject extends SpaceObject implements Rotatable, Sizable {
    private double size;
    protected int radius;
    protected int angularVelocity;

    public NaturalSpaceObject(double mass, double speed, int radius, int angularVelocity, Coordinates coordinates) {
        super(mass, speed, coordinates);
        this.radius = radius;
        this.angularVelocity = angularVelocity;
        this.size = calculateSize(this);
    }


    @Override
    public double getGravitationalAcceleration() {
        return GRAVITATIONAL_CONSTANT * getMass() / Math.pow(radius, 2);
    }

    @Override
    public boolean isСollided(SpaceObject spaceObjectFirst) {
        if (spaceObjectFirst instanceof NaturalSpaceObject) {
            boolean isColided = spaceObjectFirst.getDistance(this) > ((NaturalSpaceObject) spaceObjectFirst).radius + this.radius;
            if (isColided) {
                System.out.println("Объект "+ spaceObjectFirst.toString() + " врезался в объект " + this.toString());
            }
            return isColided;
        }
        return false;
    }

    @Override
    public double getCentripetalAcceleration() {
        if (angularVelocity == 0) {
            return 0;
        } else {
            return Math.pow(angularVelocity, 2) / radius;
        }
    }

    @Override
    public void move(int direction, int timeToMoveInSeconds) {
        if (direction == 1) {
            coordinates.setX(calculateCoordinate(coordinates.getX(), timeToMoveInSeconds));
        } else if (direction == 2) {
            coordinates.setY(calculateCoordinate(coordinates.getY(), timeToMoveInSeconds));
        } else {
            coordinates.setZ(calculateCoordinate(coordinates.getZ(), timeToMoveInSeconds));
        }
    }

    protected double calculateCoordinate(double coordinate, int timeToMoveInSeconds) {
        return coordinate += timeToMoveInSeconds * getSpeed();
    }

    public double getSize() {
        return size;
    }

    public int getRadius() {
        return radius;
    }

    public int getAngularVelocity() {
        return angularVelocity;
    }

}
