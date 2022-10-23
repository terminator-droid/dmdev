package com.dudev.oop.encapsulation.practice;

public class Rectangle {
    private Point upperLeftCorner;
    private Point lowerRightCorner;

    public Rectangle(Point upperLeftCorner, Point lowerRightCorner) {
        this.upperLeftCorner = upperLeftCorner;
        this.lowerRightCorner = lowerRightCorner;
    }

    public double getVerticalEdgeLength() {
        return upperLeftCorner.getY() - lowerRightCorner.getY();
    }

    public double getHorizontalEdgeLength() {
        return lowerRightCorner.getX() - upperLeftCorner.getX();
    }

    public double calculateSquare() {
        return (getHorizontalEdgeLength()) * (getVerticalEdgeLength());
    }

    public double calculateDiagonal() {
        return upperLeftCorner.distance(lowerRightCorner);
    }
}
