package com.dudev.regexp.practice.tasks;

import com.dudev.regexp.homework.utils.FormatUtil;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.time.temporal.ChronoField;

public class DateTimeTest {

    public static void main(String[] args) {
        LocalDateTime callDateTime = LocalDateTime.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd' 'HH:mm");
//        LocalDateTime localDateTime = dateTimeFormatter.format(callDateTime);
        String format = LocalDateTime.now().format(dateTimeFormatter);
//        System.out.println(LocalDateTime.parse(callDateTime.format(dateTimeFormatter), DATE_FORMAT));
        LocalDateTime parse = LocalDateTime.parse(format, dateTimeFormatter);
        System.out.println(parse);
    }
}
