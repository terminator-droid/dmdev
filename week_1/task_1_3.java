package com.week_1;

/**
 * Даны два прямоугольных треугольника.
 * Каждый из них задается двумя целочисленными переменными a и b - стороны треугольника.
 * Написать код, в котором вычисляется площадь каждого треугольника и затем эти площади сравниваются друг с другом.
 * <p>
 * Для этого понадобится написать 2 функции.
 * Первая: по двум сторонам прямоугольного треугольника возвращает его площадь.
 * Вторая: сравнивает переданные площади двух треугольников и выводит на консоль первый треугольник больше, меньше или равен второму.
 * Учитывать, что площадь может быть вещественным числом.
 */
public class task_1_3 {
    public static void main(String[] args) {
        int first_a = 2, first_b = 5, sec_a = 14, sec_b = 4;
        double square_1 = triangleSquareCounter(first_a, first_b);
        double square_2 = triangleSquareCounter(sec_a, sec_b);
        triangleSaquareCompare(square_1, square_2);
    }

    private static void triangleSaquareCompare(double square_1, double square_2) {
        if (square_1 > square_2) {
            System.out.println("Первый треугольник больше второго");
        } else if (square_1 < square_2) {
            System.out.println("Первый треугольник меньше второго");
        } else {
            System.out.println("Треугольники равны");
        }
    }

    private static double triangleSquareCounter(int a, int b) {
        return 0.5 * ((double) a * (double) b);
    }
}
