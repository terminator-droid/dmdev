package com.dudev.IO.practice.task;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Task4 {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("src", "com", "dudev", "IO", "practice", "task", "Task3.java");
        String string = Files.readString(path);

        String result = string.replace("public", "private");

        Path pathResult = Path.of("resources", "Task3.java");
        Files.writeString(pathResult, result);
    }
}
