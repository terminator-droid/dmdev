package com.dudev.IO.practice.datetime;

import java.time.LocalDateTime;

public class Task1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
        LocalDateTime localDateTime = dateTime.plusMonths(3);
        System.out.println(localDateTime.toLocalDate());
        System.out.println(localDateTime.toLocalTime());
        System.out.println(localDateTime);
    }
}
