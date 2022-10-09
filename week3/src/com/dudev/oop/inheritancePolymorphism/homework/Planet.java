package com.dudev.oop.inheritancePolymorphism.homework;

public class Planet extends NaturalSpaceObject implements Rotatable, Sizable, WithCircleMovement {
    private final String name;
    private final Ring[] rings;
    private final Satellite[] satellites;

    public Planet(double mass, double speed, int radius, int angularVelocity, Coordinates coordinates, String name, Ring[] rings) {
        super(mass, speed, radius, angularVelocity, coordinates);
        this.name = name;
        this.rings = rings;
        this.satellites =  new Satellite[]{new Satellite(10, 5, 2, 44, new Coordinates(6, 7,8), true, "Титан")};

    }

    static class Ring implements Printable {
        private final String color;

        public Ring(String color) {
            this.color = color;
        }

        @Override
        public void printInformation() {
            System.out.printf("%s кольцо%n", color);
        }
    }

    class Satellite extends NaturalSpaceObject implements WithCircleMovement {
        private boolean isExplored;
        private final String name;

        public Satellite(double mass, double speed, int radius, int angularVelocity, Coordinates coordinates, boolean isExplored, String name) {
            super(mass, speed, radius, angularVelocity, coordinates);
            this.isExplored = isExplored;
            this.name = name;
        }

        @Override
        public void move(NaturalSpaceObject naturalSpaceObject, int timeToMove) {
            coordinates.setCoordinates(getCoordinatesAfterMoving(naturalSpaceObject, timeToMove));
        }

        @Override
        public Coordinates getCoordinatesAfterMoving(NaturalSpaceObject planet, int timeToMove) {
            double distanceToPlanet = getDistance(Planet.this);
            double deltaX = Math.sin(45 - (speed) * timeToMove) * distanceToPlanet * speed * timeToMove;
            double deltaY = Math.cos(45 - (speed) * timeToMove) * distanceToPlanet * speed * timeToMove;
            return new Coordinates(coordinates.getX() + deltaX, coordinates.getY() + deltaY, coordinates.getZ());
        }

        private String toStringIsExplored() {
            if (isExplored) {
                return "исследован";
            } else {
                return "не исследован";
            }
        }

        @Override
        public void printInformation() {
            System.out.printf("Спутник %s массой %f, размером %f, скорость вращения вокруг планеты %f, %s%n", name, mass, getSize(), speed, toStringIsExplored());
            coordinates.printInformation();
        }
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }

    @Override
    public void move(NaturalSpaceObject naturalSpaceObject, int timeToMove) {
        coordinates.setCoordinates(getCoordinatesAfterMoving(naturalSpaceObject, timeToMove));
        for (Satellite satellite : satellites) {
            satellite.move(this, timeToMove);
        }
    }

    @Override
    public Coordinates getCoordinatesAfterMoving(NaturalSpaceObject star, int timeToMove) {
        double deltaX = Math.sin(45 - (speed) * timeToMove) * radius * speed * timeToMove;
        double deltaY = Math.cos(45 - (speed) * timeToMove) * radius * speed * timeToMove;
        return new Coordinates(coordinates.getX() + deltaX, coordinates.getY() + deltaY, coordinates.getZ());
    }

    @Override
    public void printInformation() {
        System.out.printf("Планета %s, массой %f, скорость вращения вокруг звезды %f, скорость вращения вокруг своей оси %d, ускорение свободного падения: %f, имеет %d колец: %n", name, mass, speed, angularVelocity, getCentripetalAcceleration(), rings.length);
        for (Ring ring : rings) {
            ring.printInformation();
        }
        coordinates.printInformation();
        System.out.printf("Имеет %d спутников: %n", satellites.length);
        for (Satellite satellite : satellites) {
            satellite.printInformation();
        }
    }
}
