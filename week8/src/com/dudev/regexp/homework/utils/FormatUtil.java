package com.dudev.regexp.homework.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class FormatUtil {
    private static final String PHONE_REGEX = "(?:\\+375)? ?\\(?(\\d{2})\\)? ?(\\d{3})[- ]?(\\d{2}) ?(\\d{2})";
    private static final String PHONE_PATTERN = "+375 $1 $2 $3 $4";
    public static final String DATE_PATTERN = "yyyy-MM-dd hh:mm";
    private FormatUtil() {
    }

    public static String formatPhoneNumber(String number) {
        return number.replaceAll(PHONE_REGEX, PHONE_PATTERN);
    }

    public static LocalDateTime formatDateTime(LocalDateTime dateTime) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern(DATE_PATTERN);
        return LocalDateTime.parse(dateTime.format(dateTimeFormatter), dateTimeFormatter);
    }
}
