package com.week_1;

/**
 * Дано целое число.
 * Написать функцию, которая принимает целое число, а возвращает целое число обратное этому (не строку!).
 * Результат вывести на консоль.
 */

public class task_2_2 {
    public static void main(String[] args) {
        int a = 345200;
        System.out.println(numberReverse(a));
    }

    public static int numberReverse(int number) {
        int cur_num = number;
        int result = 0;
        while (cur_num != 0) {
            result = (result * 10) + (cur_num % 10);
            cur_num /= 10;
        }
        return result;
    }
}
