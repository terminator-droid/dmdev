package com.dudev.oop.inheritancePolymorphism.homework;

public interface Rotatable {

     double getCentripetalAcceleration();

     void move(int direction, int timeToMove);

     void move(NaturalSpaceObject naturalSpaceObject, int timeToMove);
}
