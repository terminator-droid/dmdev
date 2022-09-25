package com.week_1;

/**
 * В переменной minutes лежит число от 0 до 59.
 * Написать функцию, которая принимает в качестве параметра значение переменной minutes и выводит на консоль
 * в какую четверть часа попадает это число (в первую, вторую, третью или четвертую).
 * <p>
 * Протестировать функцию в main.
 */
public class task_1_1 {
    public static void main(String[] args) {
        int minutes = 155;
        quaterCounter(minutes);
    }

    private static void quaterCounter(int minutes) {
        if (minutes < 15) {
            System.out.println("Первая четветь часа");
        } else if (minutes >= 15 && minutes < 30) {
            System.out.println("Вторая четверть часа");
        } else if (minutes >= 30 && minutes < 45) {
            System.out.println("Третья четверть часа");
        } else if (minutes >= 45 && minutes < 60) {
            System.out.println("Четвертая четверть часа");
        } else {
            System.out.println("Сколько минут в часе?");
        }
    }
}
