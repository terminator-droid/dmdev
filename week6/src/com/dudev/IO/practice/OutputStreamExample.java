package com.dudev.IO.practice;

import java.io.*;
import java.nio.file.Path;

public class OutputStreamExample {
    public static void main(String[] args) throws IOException {
        File file = Path.of("resources", "output.txt").toFile();
        try (BufferedOutputStream fileOutputStream = new BufferedOutputStream(new FileOutputStream(file, true))) {
            String s = "Hello world";
            fileOutputStream.write(s.getBytes());
            fileOutputStream.write(System.lineSeparator().getBytes());
        }

    }
}
