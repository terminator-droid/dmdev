package com.dudev.multithreading.practice.robotics.util;

import java.util.Random;

public final class RandomUtil {

    private static final Random random = new Random();

    private RandomUtil() {
    }

    public static int getRandomIntWithoutZero(int bound) {
        return random.nextInt(bound) + 1;
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

}
