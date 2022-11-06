package com.dudev.multithreading.homework.util;

import java.util.Random;

public final class RandomUtil {

    private static final Random random = new Random();

    private RandomUtil() {
    }

    public static int getRandomInt(int bound) {
        return random.nextInt(bound);
    }

    public static int getRandomIntInBoundaries(int boundLeft, int boundRight) {
        return random.nextInt(boundLeft, boundRight);
    }

}
