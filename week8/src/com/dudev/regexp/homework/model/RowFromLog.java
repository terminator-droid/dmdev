package com.dudev.regexp.homework.model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public class RowFromLog implements Row {

    private static final DateTimeFormatter isoLocalDateTimeFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
    private static final String COMMA = ", ";
    private final int number;
    private final LocalDateTime complaintDateTime;
    private final String name;
    private final String phone;
    private final Complaints complaint;

    public RowFromLog(int number, LocalDateTime complaintDateTime, String name, String phone, Complaints complaint) {
        this.number = number;
        this.complaintDateTime = complaintDateTime;
        this.name = name;
        this.phone = phone;
        this.complaint = complaint;
    }

    public RowFromLog(String[] columns) {
        this.number = Integer.parseInt(columns[0]);
        this.complaintDateTime = LocalDateTime.parse(columns[1], isoLocalDateTimeFormatter);
        this.name = columns[2];
        this.phone = columns[3];
        this.complaint = Arrays.stream(Complaints.values())
                .filter(complaint -> complaint.description.equals(columns[4]))
                .toList().get(0);
    }

    @Override
    public List<String> values() {
        return List.of(String.valueOf(number), String.valueOf(complaintDateTime), name, phone, complaint.description);
    }

    @Override
    public String rowValue() {
        return String.join(COMMA, values());
    }

    public int getNumber() {
        return number;
    }

    public LocalDateTime getComplaintDateTime() {
        return complaintDateTime;
    }

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public Complaints getComplaint() {
        return complaint;
    }
}
