package com.dudev.collections.part1.practice;

public class PersonExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        System.out.println(petr.hashCode());

    }
}
