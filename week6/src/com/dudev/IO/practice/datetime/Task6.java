package com.dudev.IO.practice.datetime;

import java.awt.*;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.Temporal;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class Task6 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime dateTime = now.with(temporal -> temporal.plus(42L, ChronoUnit.DAYS));
        System.out.println(dateTime);
    }

    private static LocalDateTime adjustToClosestYear(LocalDateTime localDateTime) {
        return localDateTime.with(it -> {
            Temporal currentYear = it.with(TemporalAdjusters.firstDayOfYear());
            Temporal nextYear = it.with(TemporalAdjusters.firstDayOfNextYear());
            long betweenCurrentYear = ChronoUnit.DAYS.between(it, currentYear);
            long betweenNextYear = ChronoUnit.DAYS.between(it, nextYear);

            return betweenNextYear > betweenCurrentYear ? currentYear : nextYear;
        });
    }
}
