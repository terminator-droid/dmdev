package com.dudev.collections.part1.practice;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MarkLengthUtil {

    private static final String TARGET_STRING = "****";
    private static final int TARGET_LENGTH = 4;

    public static void main(String[] args) {
        List<String> list = new LinkedList<>(List.of("this", "is", "lots", "of", "fun", "for", "every", "Java", "programmer"));
        markLength4(list);
        System.out.println(list);
    }

    public static void markLength4(List<String> list) {
        ListIterator<String> listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            String nextValue = listIterator.next();
            if (nextValue.length() == TARGET_LENGTH) {
                listIterator.set(TARGET_STRING);
                listIterator.add(nextValue);
            }
        }
    }
}
