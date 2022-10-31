package com.dudev.functional.lamda.practice;

public class Person {
    private int age;
    private String firstName;
    private String secondName;

    public Person(int age, String firstName, String secondName) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                '}';
    }

    public String getFullName() {
        return firstName + " " + secondName;
    }

    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }
}
