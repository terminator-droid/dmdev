package com.dudev.functional.lamda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TaskKirill {
    public static void main(String[] args) {
        String[] words = {"eat", "tea", "tan", "ate", "nat", "bat"};
    }
    private static boolean isAnagram(String firstWord, String secondWord) {
        char[] charArrayFirst = firstWord.toCharArray();
        char[] charArraySecond = secondWord.toCharArray();
        Arrays.sort(charArrayFirst);
        Arrays.sort(charArraySecond);
        return Arrays.equals(charArrayFirst, charArraySecond);
    }
}
