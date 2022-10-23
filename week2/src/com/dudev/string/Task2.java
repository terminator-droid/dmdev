package com.dudev.string;

/**
 * Дана строка с текстом, в котором есть цифры от 0 до 9.
 * <p>
 * Написать 2 метода:
 * <p>
 * - возвращающий массив цифр из переданной строки
 * - возвращающий сумму цифр из переданного целочисленного массива
 * <p>
 * Посчитать сумму всех чисел из строки
 */
public class Task2 {
    public static void main(String[] args) {
        String string = "Привет 8, как 1 2 твои дела? Может4, сделать 3 дело?";
        System.out.println((sumArray(getStringNumbers(string))));
    }

    private static int[] getStringNumbers(String string) {
        String stringNumbers = string.replaceAll("\\D", "");
        char[] charArray = stringNumbers.toCharArray();
        int[] intArray = new int[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            intArray[i] = Integer.parseInt(String.valueOf(charArray[i]));
        }
        return intArray;

    }

    private static int sumArray(int[] numbers) {
        int sum = 0;
        for (int value :
                numbers) {
            sum += value;
        }
        return sum;
    }
}
