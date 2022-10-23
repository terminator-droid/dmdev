package com.dudev.collections.part1.practice.Iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorExample {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4, 5, 6);
//        for (int i = 0; i < list.size(); i++) {
//            Integer integer = list.get(i);
//        }
//        for (Integer integer : list) {
//            System.out.println(integer);
//        }
        Iterator<Integer> iterator1 = list.iterator();
        for (list.iterator(); iterator1.hasNext();) {
            Integer next = iterator1.next();


        }
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            System.out.println(next);
        }
    }
}
