package com.dudev.oop.inheritancePolymorphism.homework;

public class Star extends NaturalSpaceObject implements Sizable {
    private final Planet[] planets;
    private final String name;
    public Star(double mass, double speed, int radius, int angularVelocity, Coordinates coordinates, Planet[] planets, String name) {
        super(mass, speed, radius, angularVelocity, coordinates);
        this.planets = planets;
        this.name = name;
    }

    @Override
    public void move(int direction, int timeToMoveInSeconds) {
        super.move(direction, timeToMoveInSeconds);
        for (Planet planet : planets) {
            planet.move(this, timeToMoveInSeconds);
        }
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("Звезда двигалась в течение %d секунд%n", timeToMoveInSeconds);
        System.out.println("----------------------------------------------------------------------");
    }

    @Override
    public String toString() {
        return "Star{" +
                "coordinates=" + coordinates +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void move(NaturalSpaceObject naturalSpaceObject, int timeToMove) {}

    @Override
    public void printInformation() {
        System.out.printf("Звезда %s с координатами: %n", name );
        coordinates.printInformation();
        System.out.println("Вокруг нее вращаются " + planets.length + " планет: ");
        for (Planet planet : planets) {
            planet.printInformation();
        }

    }
}