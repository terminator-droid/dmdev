package com.dudev.multithreading.practice.robotics.model;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Scientist {

    private final String name;
    private final Map<Detail, Integer> robotDetails = new EnumMap<>(Detail.class);

    public Scientist(String name) {
        this.name = name;
    }

    public void getRobotDetails(List<Detail> details) {
        details.forEach(detail -> robotDetails.merge(detail, 1, Integer::sum));
    }

    public List<Robot> buildRobot() {
        List<Robot> robots = new ArrayList<>();
        Optional<Integer> numberOfRobots = robotDetails.values().stream().min(Integer::compareTo);
        numberOfRobots.ifPresent(number -> {
            for (int i = 0; i < number; i++) {
                robotDetails.forEach((k, v) -> robotDetails.merge(k, -1, Integer::sum));
                robots.add(new Robot());
            }
        });
        return robots;
    }

    public String getName() {
        return name;
    }
}
