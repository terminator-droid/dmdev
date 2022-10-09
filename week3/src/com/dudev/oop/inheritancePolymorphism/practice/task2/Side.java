package com.dudev.oop.inheritancePolymorphism.practice.task2;

public class Side implements Printable {
    private Point firstPoint;
    private Point secondPoint;
    private String name;

    public Side(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.name = String.format("%s%s", firstPoint.getName(), secondPoint.getName());
    }


    public double getSideLength() {
        return firstPoint.distance(secondPoint);
    }

    public Point getMidpoint(){
        return new Point(getMidpointX(), getMidpointY(), "Centre");
    }
    public int getMidpointX(){
        return Integer.max(firstPoint.getX(), secondPoint.getX()) - Integer.min(firstPoint.getX(), secondPoint.getX());
    }
    public int getMidpointY(){
        return Integer.max(firstPoint.getY(), secondPoint.getY()) - Integer.min(firstPoint.getY(), secondPoint.getY());
    }
    @Override
    public void printInformation() {
        System.out.printf("Отрезок между двумя точками : %s(%d, %d), %s(%d, %d) длиной %f%n", firstPoint.getName(), firstPoint.getX(), firstPoint.getY(), secondPoint.getName(), secondPoint.getX(), secondPoint.getY(), getSideLength());
    }

    public String getName() {
        return name;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }
}
