package com.dudev.collections.part1.practice.task2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentSortDemo {
    public static void main(String[] args) {
        Student ivan = new Student("Avan", "Pertov", 22, 4.2);
        Student petr = new Student("Avan", "Pertov", 22, 3.4);
        Student kolya = new Student("kolya", "Ivanov", 23, 4.8);

        List<Student> students = Arrays.asList(ivan, petr, kolya);
        Collections.sort(students, new Student.ListStudentComparator());
        System.out.println(students);
        System.out.println(StudentUtil.getBestStudent(students));

    }
}
