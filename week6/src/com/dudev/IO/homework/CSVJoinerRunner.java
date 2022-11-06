package com.dudev.IO.homework;

import java.io.IOException;
import java.nio.file.Path;

import static com.dudev.IO.homework.CSVJoinerUtil.joinTwoCSVAndWriteToFile;

public class CSVJoinerRunner {
    public static void main(String[] args) throws IOException {
        Path firstFilePath = Path.of("resources", "items-price.csv");
        Path secondFilePath = Path.of("resources", "items-name.csv");
        Path resultFilePath = Path.of("resources", "result.csv");
        joinTwoCSVAndWriteToFile(firstFilePath, secondFilePath, resultFilePath);
    }
}
