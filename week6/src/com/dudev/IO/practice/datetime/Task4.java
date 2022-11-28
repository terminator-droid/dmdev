package com.dudev.IO.practice.datetime;

import java.time.*;
import java.time.temporal.ChronoUnit;

public class Task4 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate prevDate = LocalDate.of(2018, 7, 7);
        Period period = Period.between(prevDate, now);
        System.out.println(period.getDays());
        long between = ChronoUnit.DAYS.between(prevDate, now);
        System.out.println(between);

        LocalDateTime.of(now, LocalTime.MIDNIGHT);
        LocalDateTime localDateTimeNow = now.atStartOfDay();
        LocalDateTime localDateTimePrev = prevDate.atStartOfDay();
        long seconds = Duration.between(localDateTimePrev, localDateTimeNow).getSeconds();
        System.out.println(seconds);

    }
}

