package com.dudev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Random;

public class Task6 {
    private static final Map<Integer, Exception> EXCEPTIONS = Map.of(
            0, new RuntimeException(),
            2, new FileNotFoundException(),
            3, new IndexOutOfBoundsException()
    );

    public static void main(String[] args) {
        Random random = new Random();
        try {
            unsafe(random.nextInt(3));
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
    public static void unsafe(int randomValue) throws Exception {
        Exception exception = EXCEPTIONS.getOrDefault(randomValue, new DudevException("not found"));
        throw exception;
    }

}
