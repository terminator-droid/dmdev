package com.dudev.functional.lamda.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Task4 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 4, 5, 6, 4, 3);
        String result = list.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
        System.out.println(result);
    }
}
