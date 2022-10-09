package com.dudev.oop.inheritancePolymorphism.homework;

import static java.lang.Math.PI;

public interface Sizable {


    default double calculateSize(NaturalSpaceObject naturalSpaceObject) {
        return (double) 4 / 3 * PI * Math.pow(naturalSpaceObject.radius, 2);
    }

    default double getSquare(NaturalSpaceObject naturalSpaceObject) {
       return  4 * PI * Math.pow(naturalSpaceObject.radius, 2);
    }

}
