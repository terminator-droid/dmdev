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
        StringBuilder stringBuilder = new StringBuilder(string.replaceAll("\\s*", "").toUpperCase(Locale.ROOT));
        for (int i = 0; i < stringBuilder.length() - 1; i++) {
            while (stringBuilder.charAt(i) == stringBuilder.charAt(i + 1)) {
                stringBuilder.deleteCharAt(i);
                if (i == stringBuilder.length() - 1) {
                    break;
                }
            }
        }
        return stringBuilder.toString();
    }

}
