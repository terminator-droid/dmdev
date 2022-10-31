package com.dudev.IO.practice.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "test.txt");
        Files.readAllLines(path)
                .stream().map(Task3::findMaxDigitsCount)
                .forEach(System.out::println);

    }

    public static Integer findMaxDigitsCount(String s) {
        int result = 0;
        int counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                counter++;
            } else {
                result = Math.max(result, counter);
                counter = 0;
            }
        }
        return result;
    }
}
