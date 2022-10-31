package com.dudev.exceptions.practice;

import java.io.FileNotFoundException;
import java.util.concurrent.TimeoutException;

public class ExceptionsExample {
    public static void main(String[] args) {
        try {
            unsafe(-10);
        } catch (Exception exception) {
            // handle exception
            exception.printStackTrace();
        } finally {
            System.out.println("Finally");
        }
        //code
    }
    public static void unsafe(int value) throws FileNotFoundException, TimeoutException {
        if (value > 0) {
            throw new FileNotFoundException();
        }
    }
}
