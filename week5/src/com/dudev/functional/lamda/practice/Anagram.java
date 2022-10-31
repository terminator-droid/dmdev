package com.dudev.functional.lamda.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

public class Anagram {
    public static void main(String[] args) {

    }

    public static List<List<String>> groupAnagram(String[] strings) {
        Map<String, List<String>> stringListMap = new HashMap<>();

        for (String string : strings) {
            char[] currentString = string.toCharArray();
            Arrays.sort(currentString);
//            Arrays.stream()
        }


        return null;
    }
}
