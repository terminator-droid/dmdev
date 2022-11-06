package com.dudev.multithreading.practice.robotics.model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public final class DetailsUtil {

    private DetailsUtil() {
    }

    public static List<Detail> getRandomDetails(int seed) {
        Random random = new Random();
        int numberOfDetails = random.nextInt(seed);
        List<Detail> details = new LinkedList<>();
        for (int i = 0; i < numberOfDetails; i++) {
            details.add(Detail.values()[random.nextInt(Detail.values().length)]);
        }
        return details;
    }
}