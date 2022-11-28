package com.dudev.IO.practice.datetime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Task2 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        now.format(dateTimeFormatter);
        String format = now.format(dateTimeFormatter);
        System.out.println(format);
    }
}
