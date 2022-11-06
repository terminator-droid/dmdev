package com.dudev.IO.practice.task;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.stream.Stream;

public class Task5 {
    public static void main(String[] args) {
        Path path = Path.of("src", "com", "dudev", "IO", "practice", "task", "Task3.java");
        Path pathResult = Path.of("resources", "Task3.java");

        try(Stream<String> lines = Files.lines(path);
            BufferedWriter bufferedWriter = Files.newBufferedWriter(pathResult, StandardOpenOption.TRUNCATE_EXISTING)) {
            Files.lines(path)
                    .map(StringBuilder::new)
                    .map(StringBuilder::reverse)
                    .forEach(line -> {
                        try {
                            bufferedWriter.write(line.toString());
                            bufferedWriter.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
