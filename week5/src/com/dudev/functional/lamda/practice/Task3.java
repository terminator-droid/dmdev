package com.dudev.functional.lamda.practice;

import java.util.Map;

public class Task3 {
    public static void main(String[] args) {
        Map<String, Integer> stringIntegerMap = Map.of(
                "1", 1,
                "12324", 233,
                "45234423", 2332,
                "333", 132
        );
        int sum = stringIntegerMap.entrySet().stream()
                .filter(stringIntegerEntry -> stringIntegerEntry.getKey().length() < 7)
                .mapToInt(Map.Entry::getValue)
                .sum();
        System.out.println(sum);
    }
}
