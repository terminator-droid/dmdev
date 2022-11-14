package com.dudev.regexp.homework.model;

import java.time.LocalDateTime;
import java.util.List;


public class RowToLog implements Row {
    private static final String COMMA = ", ";
    private int number;
    private final LocalDateTime dateTime;
    private final String phoneNumber;


    public RowToLog(int number, LocalDateTime dateTime, String phoneNumber) {
        this.number = number;
        this.dateTime = dateTime;
        this.phoneNumber = phoneNumber;
    }

    public void setNumber(int numberToSet) {
        number = numberToSet;
    }

    @Override
    public List<String> values() {
        return List.of(String.valueOf(number), String.valueOf(dateTime), phoneNumber);
    }

    @Override
    public String rowValue() {
        return String.join(COMMA, values());
    }
}
