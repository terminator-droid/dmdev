package com.dudev.functional.lamda.practice;

import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 1, 4, 5, 25, 4, 3, 2, 4, 15, 67, 7);
        list.stream()
                .filter(value -> value % 2 != 0 )
                .filter(value -> value % 5 == 0)

                .mapToInt(Integer::intValue)
                .average()
                .ifPresent(System.out::println);
    }
}
