package com.dudev.functional.lamda.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.dudev.functional.lamda.homework.Scores.*;

public class StudentRunner {
    public static void main(String[] args) {
        Student ivan = new Student("Ivan", "Ivanov", 2, List.of(A, B, C, A, A, B, D));
        Student petr = new Student("Petr", "Petrov", 3, List.of(A, A, D, C, D, C, D));
        Student kirill = new Student("Kirill", "Kotlyarov", 4, List.of(A, B, A, A, B, B, B));
        Student gena = new Student("Gennadiy", "Goshin", 2, List.of(A, A, A, D, D, C, D));
        Student grover = new Student("Grover", "Grovestreet", 2, List.of(A, A, A, A, A, B, B));
        List<Student> students = List.of(ivan, petr, kirill, gena, grover);
        Comparator<Student> comparing = Comparator.comparing(Student::getFullName);
        System.out.println((ivan.getAverageScore() + gena.getAverageScore() + grover.getAverageScore()) / 3);
        System.out.println(StudentsUtil.getAverageScore(students));
        System.out.println(StudentsUtil.getListOfStudentsByCourses(students));
        System.out.println(StudentsUtil.getObjectsByCourses(students));
    }
}
