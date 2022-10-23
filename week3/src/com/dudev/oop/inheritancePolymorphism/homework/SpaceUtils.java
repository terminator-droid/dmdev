package com.dudev.oop.inheritancePolymorphism.homework;

public final class SpaceUtils {
    public static final double GRAVITATIONAL_CONSTANT = 6.67430 * 1e-11;

    public SpaceUtils() {
    }

    public static double calculateGravityForce(SpaceObject spaceObjectFirst, SpaceObject spaceObjectSecond) {
        return GRAVITATIONAL_CONSTANT * spaceObjectFirst.getMass() * spaceObjectSecond.getMass() / spaceObjectFirst.getDistance(spaceObjectSecond);
    }
    private static boolean isStar (SpaceObject spaceObject) {
        return spaceObject instanceof Star;
    }
}
