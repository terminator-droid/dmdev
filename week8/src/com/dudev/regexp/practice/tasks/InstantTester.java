package com.dudev.regexp.practice.tasks;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class InstantTester {
    public static void main(String[] args) {

        Instant now = Instant.now().truncatedTo(ChronoUnit.SECONDS);
        LocalDateTime now1 = LocalDateTime.now();



        long l = now.toEpochMilli();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm").withZone(ZoneId.systemDefault());
        String format1 = dateTimeFormatter.format(now1);
        String format = dateTimeFormatter.format(now);

        System.out.println(format1);

    }
}
