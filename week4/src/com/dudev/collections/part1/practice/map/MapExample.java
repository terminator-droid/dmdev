package com.dudev.collections.part1.practice.map;

import com.dudev.collections.part1.practice.Person;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");

        Map<Integer, Person> map = new HashMap<>();
        map.put(ivan.getId(), ivan);
        map.put(petr.getId(), petr);

        System.out.println(map.get(2));

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for (Person person : map.values()) {
            System.out.println(person.getId());
        }
    }
}
