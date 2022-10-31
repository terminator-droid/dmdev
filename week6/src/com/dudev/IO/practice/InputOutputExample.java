package com.dudev.IO.practice;

import java.io.*;
import java.nio.file.Path;

public class InputOutputExample {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "test.txt").toFile();
        try (FileInputStream fileInputStream = new FileInputStream(file)) {
            byte[] bytes = fileInputStream.readAllBytes();
            String s = new String(bytes);
            System.out.println(s);
        }
    }
}
