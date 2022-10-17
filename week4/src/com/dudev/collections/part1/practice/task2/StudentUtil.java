package com.dudev.collections.part1.practice.task2;

import java.util.List;

public final class StudentUtil {
    private StudentUtil() {
    }

    public static Student getBestStudent(List<Student> studentList) {
        Student bestStudent = null;
        for (Student student : studentList) {
            if (bestStudent == null || bestStudent.getMeanScore() < student.getMeanScore()) {
                bestStudent = student;
            }
        }
        return bestStudent;
    }
}
