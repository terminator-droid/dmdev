package com.week_1;

/**
 * Посчитать четные и нечетные цифры целого числа и вывести их на консоль.
 * Для решения написать 2 функции, которые будут принимать введенное целое число, а возвращать количество четных цифр (вторая функция - нечетных).
 */

public class task_2_1 {
    public static void main(String[] args) {
        int number = 142431111;
        int even = evenCounter(number);
        int odd = oddCounter(number);
        System.out.println("Четных цифр: " + even);
        System.out.println("Нечетных цифр:  " + odd);
    }

    private static int oddCounter(int number) {
        int sum = 0;
        int cur_number = number;
        while (cur_number != 0) {
            if (cur_number % 10 % 2 != 0) {
                sum += 1;
            }
            cur_number /= 10;
        }
        return sum;
    }

    private static int evenCounter(int number) {
        int sum = 0;
        int cur_number = number;
        while (cur_number != 0) {
            if (cur_number % 10 % 2 == 0) {
                sum += 1;
            }
            cur_number /= 10;
        }
        return sum;
    }
}
