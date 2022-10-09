package com.dudev.oop.encapsulation.practice;

public class RectangleRunner {
    public static void main(String[] args) {
        Point leftCorner = new Point(1, 4);
        Point rightCorner = new Point(5, 1);

        Rectangle rectangle = new Rectangle(leftCorner, rightCorner);
        System.out.println(rectangle.calculateDiagonal());
        System.out.println(rectangle.calculateSquare());
    }
}
