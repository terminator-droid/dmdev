package com.dudev.regexp.homework.utils;

import com.dudev.regexp.homework.model.Row;
import com.dudev.regexp.homework.model.RowFromLog;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public final class LogWriterReader {

    private static final String COMMA = ", ";
    private LogWriterReader() {
    }

    public static void writeLog(Path logPath, Row logRow) throws IOException {
        var row = logRow.rowValue();
        Files.writeString(logPath, row + "\n", StandardOpenOption.APPEND);
    }

    public static List<RowFromLog> readLog(Path path, int currentRow) throws IOException {
        return Files.lines(path).skip(currentRow).map(line -> new RowFromLog(line.split(COMMA))).toList();
    }
}
