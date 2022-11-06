package com.dudev.IO.homework;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toList;
import static java.util.stream.Collectors.toMap;

public final class CSVJoinerUtil {
    public static final int KEY_INDEX = 0;
    public static final int VALUE_INDEX = 1;

    private CSVJoinerUtil() {
    }

    public static void joinTwoCSVAndWriteToFile(Path firstFilePath, Path secondFilePath, Path resultPath) throws IOException {
        Map<String, String> firstFileMapped = CSVtoMap(firstFilePath);
        Map<String, String> secondFileMapped = CSVtoMap(secondFilePath);
        Stream.of(firstFileMapped, secondFileMapped)
                .flatMap(map -> map.entrySet().stream())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (firstEntry, secondEntry) -> firstEntry + "," + secondEntry))
                .forEach((key, value) -> {
                    try {
                        Files.writeString(resultPath, String.join(",", key, value) + "\n", StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                });
    }

    private static Map<String, String> CSVtoMap(Path filePath) throws IOException {
        try (Stream<String> lines = Files.lines(filePath)) {
            return lines.map(line -> Arrays.stream(line.split(",")).toList())
                    .collect(Collectors.toMap(line -> line.get(KEY_INDEX), line -> line.get(VALUE_INDEX)))
                    .entrySet()
                    .stream()
                    .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                    .collect(toMap(Map.Entry::getKey, Map.Entry::getValue,(first, sec) -> first, LinkedHashMap::new));
        }
    }
}
