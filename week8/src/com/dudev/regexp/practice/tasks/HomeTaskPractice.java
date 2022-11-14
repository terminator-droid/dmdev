package com.dudev.regexp.practice.tasks;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeTaskPractice {
    public static void main(String[] args) {
        String phoneNumber = "322343243";
        String regex = "(?:\\+375)? ?\\(?(\\d{2})\\)? ?(\\d{3})[- ]?(\\d{2}) ?(\\d{2})";
//        Pattern pattern = Pattern.compile(regex);
//        Matcher matcher = pattern.matcher(phoneNumber);
//        while (matcher.find()) {
//            String resultString = String.valueOf(matcher.appendReplacement(new StringBuffer(), "+375 $1 $2 $3 $4"));
//            System.out.println(resultString);
//        }
        System.out.println(phoneNumber.replaceAll(regex, "+375 $1 $2 $3 $4"));
    }
}
