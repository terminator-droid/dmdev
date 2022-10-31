package com.dudev.exceptions.practice;

public class Task1 {
    public static void main(String[] args) {
        int[] values = {1, 3 ,4 ,5 ,34};
        try {
            System.out.println(values[13]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        }
    }
}
