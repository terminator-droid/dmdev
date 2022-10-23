package com.dudev.generics.practice;

public class ListRunner {

    public static void main(String[] args) {
        List<String> list = new List<>(10);
        list.add("123");
        list.add("12qerfr");
        String o =  list.get(1);
        System.out.println(o);
    }
}
