package com.dudev.string;

import java.util.Locale;

/**
 * Дана строка.
 * Удалить из нее все повторяющиеся символы без учета регистра, если они идут друг за другом. Также удалить пробелы.
 * Результат привести к верхнему регистру.
 */
public class Task1 {
    public static void main(String[] args) {
        String string = "abc Cpddd Dio OsfWw";
        System.out.println(deleteFromString(string));
    }

    private static String deleteFromString(String string) {
        StringBuilder result = new StringBuilder().append(string.charAt(0));
        for (int i = 1; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            char previousChar = result.charAt(result.length() - 1);
            if (previousChar != currentChar && currentChar != ' ') {
                result.append(currentChar);
            }
        }
        return result.toString();
    }
}
