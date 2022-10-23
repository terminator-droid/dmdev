package com.dudev.functional.lamda;

import java.util.stream.Stream;

public class MapReduceExample {
    public static void main(String[] args) {
        Stream.of(new Student(12, "Ivan"),
                new Student(14, "IVasd") )
                .map(Student::getAge)
                .reduce(Math::max)
                .ifPresent(System.out::println);
    }
}
