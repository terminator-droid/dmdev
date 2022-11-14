package com.dudev.regexp.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FirstExample {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\d{3}");
        Matcher matcher = pattern.matcher("323");
        System.out.println(matcher.matches());

    }
}
