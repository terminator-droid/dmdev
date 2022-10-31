package com.dudev.exceptions.practice;

public class Task5 {
    public static void main(String[] args) {

    }
    private static void catchRuntimeException() {
        try {
            unsafe();
        } catch (RuntimeException e) {
            System.out.println("Caught");
            throw new DudevException(e);
        }
    }
    public static void unsafe() {
        throw new RuntimeException("oops");
    }
}
