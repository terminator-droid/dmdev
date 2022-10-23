package com.dudev.collections.part1.practice.map;

import com.dudev.collections.part1.practice.Person;

import java.util.*;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Person ivan = new Person(1, "Ivan", "Ivanov");
        Person petr = new Person(2, "Petr", "Petrov");
        Person sveta = new Person(3, "Sveta", "Swetoch");

        List<String> strings = Arrays.asList("122", "324", "312");
        Collections.sort(strings);
        System.out.println(strings);

        List<Person> personList = Arrays.asList(ivan, petr, sveta);
        Collections.sort(personList);
        personList.sort(new FirstNameComparator());
        List<Integer> integers = new ArrayList<>();

    }
    public static class FirstNameComparator implements Comparator<Person> {

        @Override
        public int compare(Person o1, Person o2) {
            return o1.getFirstName().compareTo(o2.getFirstName());
        }
    }
}
