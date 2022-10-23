package com.dudev.oop.inheritancePolymorphism.practice.task2;

public class FigureRunner {
    public static void main(String[] args) {
        Point point1 = new Point(1, 1, "A");
        Point point2 = new Point(1, 2, "B");
        Point point3 = new Point(4, 2, "C");
        Point point4 = new Point(4, 1, "D");
        Side side1 = new Side(point1, point2);
        Side side2 = new Side(point2, point3);
        Side side3 = new Side(point3, point4);
        Side side4 = new Side(point4, point1);


        Rectangle rectangle = new Rectangle(side1, side2, side3, side4);
        rectangle.printInformation();
        rectangle.getCentre().printInformation();
    }
}
