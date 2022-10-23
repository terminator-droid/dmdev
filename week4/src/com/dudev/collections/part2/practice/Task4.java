package com.dudev.collections.part2.practice;

import java.util.*;

public class Task4 {
    public static void main(String[] args) {
        Map<Integer, Integer> polynomialFirst = Map.of(
                1, 1,
                2, 2,
                3, 4,
                4, 5,
                6, 6
        );
        Map<Integer, Integer> polynomialSecond = Map.of(
                1, 3,
                3, 6,
                4, 7,
                6, 4
        );

        System.out.println(convertToString(summarisePolynomial(polynomialFirst, polynomialSecond)));
    }

    private static String convertToString(Map<Integer, Integer> polynomial) {
        TreeMap<Integer, Integer> sortedMap = new TreeMap<>(Comparator.reverseOrder());
        sortedMap.putAll(polynomial);
        List<String> values = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : sortedMap.entrySet()) {
            String value = entry.getKey() == 0
                    ? String.valueOf(entry.getValue())
                    : entry.getValue() + "x^" + entry.getKey();
            values.add(value);
        }
        return String.join(" + ", values);
    }

    private static Map<Integer, Integer> summarisePolynomial(Map<Integer, Integer> polynomialFirst, Map<Integer, Integer> polynomialSecond) {
        Map<Integer, Integer> result = new HashMap<>(polynomialFirst);
        for (Map.Entry<Integer, Integer> entry : polynomialSecond.entrySet()) {
//            result.put(key, polynomialFirst.get(key) + polynomialSecond.getOrDefault(key, 0));
            result.merge(entry.getKey(), entry.getValue(), Integer::sum);
        }
        return result;
    }

}
