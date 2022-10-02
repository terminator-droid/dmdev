package com.dudev.arrays;

/**
 * Дан одномерный массив целых чисел.
 * Написать функцию, удаляющую из него все отрицательные элементы (удалить - значит создать новый массив с только положительными элементами).
 * После удаления - умножить каждый элемент массива на его длину.
 * Например: [3, 5, -6, 3, 2, -9, 0, -123] -> [15, 25, 15, 10, 0]
 */
public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 4, 5, -4, -45, 2, -123};
        printArray(deleteNegative(values));
    }

    private static int[] deleteNegative(int[] values) {
        int positiveArrayLen = 0;
        for (int value : values) {
            if (value >= 0) {
                positiveArrayLen++;
            }
        }
        int[] postitiveArray = new int[positiveArrayLen];
        int positiveArrayIndex = 0;
        for (int value : values) {
            if (value >= 0) {
                postitiveArray[positiveArrayIndex++] = value * positiveArrayLen;
            }
        }
        return postitiveArray;
    }

    private static void printArray(int[] values) {
        for (int value : values) {
            System.out.print(value + " ");
        }
    }
}
