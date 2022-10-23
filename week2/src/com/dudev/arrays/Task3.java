package com.dudev.arrays;

/**
 * Дан одномерный массив целых чисел.
 * <p>
 * Написать функцию, которая принимает этот массив и разбивает на 3 других: с только отрицательными числами, только положительными и только нули.
 * Если для какого-то из массивов не будет значений, то должен быть создан пустой массив.
 * Возвращает функция эти три массива в виде одного двумерного.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] values = {1, 4, -6, 24, 63, 0, 0, -111, 234};
        int[][] valueClassified = classifyArrayElements(values);
        printDoubleDimensionalArray(valueClassified);
    }

    private static void printDoubleDimensionalArray(int[][] valueClassified) {
        for (int[] row : valueClassified) {
            for(int value : row) {
                System.out.print(value + " ");
            }
            System.out.println("\n");
        }
    }

    private static int[][] classifyArrayElements(int[] values) {
        int[][] resultArray = new int[3][];
        int zeroArrayLen = 0;
        int positiveArrayLen = 0;
        int negativeArrayLen = 0;
        for (int value : values) {
            if (value < 0) {
                negativeArrayLen++;
            } else if (value > 0) {
                positiveArrayLen++;
            } else {
                zeroArrayLen++;
            }
        }
        int[] zeroArray = new int[zeroArrayLen];
        int[] positiveArray = new int[positiveArrayLen];
        int[] negativeArray = new int[negativeArrayLen];
        int zeroArrayIndex = 0;
        int positiveArrayIndex = 0;
        int negativeArrayIndex = 0;
        for (int value : values) {
            if (value < 0) {
                negativeArray[negativeArrayIndex++] = value;
            } else if (value > 0) {
                positiveArray[positiveArrayIndex++] = value;
            } else {
                zeroArray[zeroArrayIndex++] = value;
            }
        }
        resultArray[0] = negativeArray;
        resultArray[1] = zeroArray;
        resultArray[2] = positiveArray;
        return resultArray;
    }
}
