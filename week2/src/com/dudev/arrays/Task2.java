package com.dudev.arrays;

/**
 * Дан одномерный массив символов.
 * Преобразовать его в одномерный массив чисел, где число - это код символа (любой символ - это число в памяти компьютера).
 * Например: [‘a’, ‘6’, ‘y’, ‘P’, ‘T’, ‘q’, ‘9’, ‘+’] -> [97, 54, 121, 80, 84, 113, 57, 43]
 * <p>
 * Далее определить среднее арифметическое всех элементов целочисленного массива и вывести на консоль только те элементы, которые больше этого среднего арифметического.
 */
public class Task2 {
    public static void main(String[] args) {
        char[] symbols = {'d', '3', 'd', 'g'};
        int[] values = getCharCode(symbols);
        printValuesGTAVG(values);
    }

    private static void printValuesGTAVG(int[] values) {
        int sum = 0;
        for (int value : values) {
            sum += value;
        }
        double average = (double) sum / values.length;
        for (int value : values) {
            if (value > average) {
                System.out.print(value + " ");
            }
        }
    }

    private static int[] getCharCode(char[] symbols) {
        int[] values = new int[symbols.length];
        for (int i = 0; i < symbols.length; i++) {
            values[i] = symbols[i];
        }
        return values;
    }
}
