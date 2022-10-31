package com.dudev.functional.lamda.homework;

import com.dudev.functional.lamda.practice.Person;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public final class StudentsUtil {

    private StudentsUtil() {
    }

    public static Map<Integer, Student.StudentsAndAverageScores> getObjectsByCourses(List<Student> students) {
        return students.stream()
                .collect(Collectors.groupingBy(Student::getCourseNumber, Collectors.collectingAndThen(toList(),
                        list -> {
                            List<String> listedStudents = list.stream()
                                    .map(Student::getFullName)
                                    .sorted(Comparator.comparing(Function.identity())).toList();
                            double average = list.stream()
                                    .mapToDouble(Student::getAverageScore)
                                    .average()
                                    .orElse(0);
                            return new Student.StudentsAndAverageScores(listedStudents, average);

                        })));
    }

    public static Map<Integer, List<String>> getListOfStudentsByCourses(List<Student> students) {
//        return students.stream().collect(toMap(Student::getCourseNumber, Student::getFullName));
//        students.stream().
//                .collect(Collectors.groupingBy(Student::getCourseNumber, Collectors.flatMapping(student ->Stream.of(student.getFullName()).sorted(Comparator.comparing()),toList())));
        return students.stream().collect(groupingBy(Student::getCourseNumber,
                Collectors.collectingAndThen(Collectors.mapping(Student::getFullName, toList()), l -> {
                    l.sort(Comparator.naturalOrder());
                    return l;
                })));

    }

    public static Map<Integer, Double> getAverageScore(List<Student> students) {
        return students.stream()
                .filter(student -> student.getScores().size() > 3)
                .collect(Collectors.groupingBy(Student::getCourseNumber, Collectors.averagingDouble(Student::getAverageScore)));
    }
}
