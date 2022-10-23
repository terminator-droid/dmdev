package com.dudev.collections.part2.practice;

import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 3, 4, 6, 3, 2, 5, 3);
        System.out.println(removeEven(list));
        HashMap<String, String> stringStringHashMap = new HashMap<>();

    }

    private static List<Integer> removeEven(List<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (Integer integer : list) {
            if (integer % 2 != 0) {
                result.add(integer);
            }
        }
        return result;
    }

    private static int countUnique(List<Integer> list) {
        return new HashSet<>(list).size();
    }
    private static boolean unique(Map<String, String> map) {
        return map.size() == new HashSet<String>(map.values()).size();
    }
}
