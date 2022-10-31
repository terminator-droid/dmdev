package com.dudev.functional.lamda.practice;

import java.util.List;
import java.util.stream.Collectors;

public class Task2 {
    public static void main(String[] args) {
        List<String> strings = List.of("dfw", "123f23ef2", "dfw4r14ts", "dfw4r14ts");
        long size = strings.stream().filter(string -> string.length() > 8)
                .distinct().count();
        System.out.println(size);
    }
}
