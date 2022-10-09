package com.dudev.oop.inheritancePolymorphism.practice.task2;


public class Rectangle extends Polygon implements Printable {

    private Side firstSide, secondSide, thirdSide, fourthSide;
    private Point leftUpperCorner, rightLowerCorner;

    public Rectangle(Side firstSide, Side secondSide, Side thirdSide, Side fourthSide) {
        super(4);
        if (isValidRectangle(firstSide, thirdSide)) {
            this.firstSide = firstSide;
            this.secondSide = secondSide;
            this.thirdSide = thirdSide;
            this.fourthSide = fourthSide;
            initializePoints();
        } else {
            System.out.println("Invalid sides of rectangle");
        }
    }

    public Rectangle(Point leftUpperCorner, Point rightLowerCorner) {
        super(4);
        this.leftUpperCorner = leftUpperCorner;
        this.rightLowerCorner = rightLowerCorner;
        initializeSides();
    }

    protected void initializeSides() {
        Point c = new Point(rightLowerCorner.getX(), leftUpperCorner.getY(), "C");
        Point a = new Point(leftUpperCorner.getX(), rightLowerCorner.getY(), "A");
        this.firstSide = new Side(a, leftUpperCorner);
        this.secondSide = new Side(leftUpperCorner, c);
        this.thirdSide = new Side(c, rightLowerCorner);
        this.firstSide = new Side(rightLowerCorner, a);

    }

    protected void initializePoints() {
        this.leftUpperCorner = firstSide.getSecondPoint();
        this.rightLowerCorner = thirdSide.getSecondPoint();
    }


    private Side getDiagonal() {
        return new Side(leftUpperCorner, rightLowerCorner);
    }

    private boolean isValidRectangle(Side firstSide, Side thirdSide) {
        return firstSide.getFirstPoint().getX() == firstSide.getSecondPoint().getX() && thirdSide.getSecondPoint().getY()
                == firstSide.getFirstPoint().getY() && thirdSide.getFirstPoint().getX() == thirdSide.getSecondPoint().getX() &&
                thirdSide.getFirstPoint().getY() == firstSide.getSecondPoint().getY();
//        return getDiagonal(firstSide.getSecondPoint(), thirdSide.getSecondPoint()).getMidpoint().equals(getDiagonal(firstSide.getFirstPoint(), thirdSide.getFirstPoint()).getMidpoint());
    }

    public String getName() {
        return firstSide.getName() + thirdSide.getName();
    }

    @Override
    public String toString() {
        return String.format("%s%s", firstSide.getName(), thirdSide.getName());
    }

    @Override
    public void printInformation() {
        System.out.println("Прямоугольник, состоящий из сторон:");
        for (Side side : getListOfSides()) {
            System.out.printf("%s%n", side.getName());
            side.printInformation();
        }
        System.out.println("Площадь прямоугольника: " + getSquare());
        System.out.println("Периметр прямоугольника: " + getPerimeter() );
    }

    @Override
    public Side[] getListOfSides() {
        return new Side[]{firstSide, secondSide, thirdSide, fourthSide};
    }

    @Override
    public Point getCentre() {
        Point centre = getDiagonal().getMidpoint();
        centre.setName("Центр фигуры " + this.getName());
        return centre;
    }

    @Override
    public double getSquare() {
        return firstSide.getSideLength() * secondSide.getSideLength();
    }

    @Override
    public double getPerimeter() {
        return (firstSide.getSideLength() + secondSide.getSideLength()) * 2;
    }
}
