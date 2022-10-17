package com.dudev.collections.part1.practice.task2;

import java.util.Comparator;

public class Student {
    private final String name;
    private final String secondName;
    private final int age;
    private final double meanScore;

    public Student(String name, String secondName, int age, double meanScore) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.meanScore = meanScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", meanScore=" + meanScore +
                '}';
    }

    public static class ListStudentComparator implements Comparator<Student> {

        @Override
        public int compare(Student o1, Student o2) {
            if (o1.name.compareToIgnoreCase(o2.name) != 0) {
                return o1.name.compareToIgnoreCase(o2.name);
            } else if (o1.secondName.compareToIgnoreCase(o2.secondName) != 0) {
                return o1.secondName.compareToIgnoreCase(o2.secondName);
            } else if (o1.age != o2.age) {
                return Integer.compare(o1.age, o2.age);
            } else {
                return Double.compare(o1.meanScore, o2.meanScore);
            }
        }
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getAge() {
        return age;
    }

    public double getMeanScore() {
        return meanScore;
    }
}
