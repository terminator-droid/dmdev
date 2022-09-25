package com.week_1;

/**
 * Даны 3 переменные:
 * <p>
 * - operand1 (double)
 * - operand2 (double)
 * - operation (char ‘+’, ‘-’, ‘*’, ‘/’, ‘%’)
 * <p>
 * Написать функцию, которая принимает в качестве параметров эти три переменные и возвращает результат операции.
 * Протестировать функцию в main.
 */
public class task_1_2 {
    public static void main(String[] args) {
        double first_op = 43, sec_op = 10;
        char operation = '%';
        mathCounter(first_op, sec_op, operation);
    }

    public static void mathCounter(double first_op, double sec_op, char operation) {
        double result = 0;
        switch (operation) {
            case '+' -> result = first_op + sec_op;
            case '-' -> result = first_op - sec_op;
            case '*' -> result = first_op * sec_op;
            case '/' -> result = first_op / sec_op;
            case '%' -> result = first_op % sec_op;
            default -> System.out.println("Такой операции нет");
        }
        System.out.println(result);
    }
}
