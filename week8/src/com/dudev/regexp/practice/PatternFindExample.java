package com.dudev.regexp.practice;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternFindExample {
    private static String phoneNumber = "l;4k23l; k 324l;k12;34k  3o4k2p34k12 po3p1o234p123 k4p12o3k4 p13k4p12o3k po1k pwedfokgwepogkwp";

    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("");
        Matcher matcher = pattern.matcher(phoneNumber);
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher1 = pattern.matcher(phoneNumber);
        while (matcher.find()) {
            matcher.appendReplacement(stringBuilder, "123");
        }
    }
}
