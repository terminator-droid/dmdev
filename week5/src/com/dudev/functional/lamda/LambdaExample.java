package com.dudev.functional.lamda;

import java.util.Comparator;

public class LambdaExample {

    public static void main(String[] args) {
        Comparator<Integer> integerComparator = Integer::compare;

        System.out.println(integerComparator.compare(1, 42));
    }
    private static class IntegerComparator implements Comparator<Integer> {

        @Override
        public int compare(Integer o1, Integer o2) {
            return 0;
        }
    }

}
