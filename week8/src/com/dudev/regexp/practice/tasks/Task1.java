package com.dudev.regexp.practice.tasks;

import java.util.regex.Pattern;

public class Task1 {
    public static void main(String[] args) {
        String regex = "[a-zA-Z]\\w*@\\w{3,}\\.(org|com)";
        String input = "ussdanil@gmail.com";
        System.out.println(Pattern.matches(regex, input));
    }
}
