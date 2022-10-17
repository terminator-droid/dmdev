package com.dudev.collections.part1.homework.task1;

public class Chat implements Comparable<Chat> {
    private final String name;
    private final int userNumber;

    public Chat(String name, int userNumber) {
        this.name = name;
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "Chat{" +
                "name='" + name + '\'' +
                ", userNumber=" + userNumber +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getUserNumber() {
        return userNumber;
    }

    @Override
    public int compareTo(Chat o) {
        return name.compareTo(o.getName());
    }
}
