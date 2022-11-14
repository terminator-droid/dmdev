package com.dudev.regexp.homework.utils;

import com.dudev.regexp.homework.model.Complaints;
import com.dudev.regexp.homework.model.User;

import java.util.List;
import java.util.Random;

public final class RandomUtil {

    private static final Random random = new Random();

    public static User getRandomUser(List<User> users) {
        return users.get(random.nextInt(users.size()));
    }

    public static Complaints getRandomComplaint() {
        return Complaints.values()[random.nextInt(Complaints.values().length)];
    }
}
