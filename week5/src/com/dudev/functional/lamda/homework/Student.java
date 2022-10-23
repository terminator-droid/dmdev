package com.dudev.functional.lamda.homework;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

public class Student {
    private final String name;
    private final String secondName;
    private final int courseNumber;
    private final List<Scores> scores;
    record StudentsAndAverageScores(List<String> studentsSorted, double averageScore) {};

    public Student(String name, String secondName, int courseNumber, List<Scores> scores) {
        this.name = name;
        this.secondName = secondName;
        this.courseNumber = courseNumber;
        this.scores = scores;
    }
    public double getAverageScore() {
        return scores.stream()
                .mapToInt(Scores::getScore)
                .average()
                .orElse(0.0);
    }
    public String getFullName() {
        return name + " " + secondName;
    }
    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public List<Scores> getScores() {
        return scores;
    }
}
