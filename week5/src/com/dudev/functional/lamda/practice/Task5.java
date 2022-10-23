package com.dudev.functional.lamda.practice;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Task5 {
    public static void main(String[] args) {
        List<Person> people = List.of(new Person(66, "Fucker", "Fuck"),
                new Person(66, "Sucker", "Suck"),
                new Person(55, "Banger", "Bang"));
        people.stream()
                .filter(person -> person.getFullName().length() < 15)
                .max(Comparator.comparing(Person::getAge))
                .map(Person::getFullName)
                .ifPresent(System.out::println);

        Map<Integer, List<Person>> personsMap =  people.stream().collect(Collectors.groupingBy(Person::getAge, Collectors.mapping(Function.identity(), Collectors.toList())));
        System.out.println(personsMap);
    }
}
