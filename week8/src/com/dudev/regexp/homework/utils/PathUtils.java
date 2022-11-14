package com.dudev.regexp.homework.utils;

import java.nio.file.Path;

public final class PathUtils {

    private static final String ROOT_DIR = "src/com/dudev/regexp/homework/log";
    public static final Path COMPLAINT_LOG = Path.of(ROOT_DIR, "complaints_logger.txt");
    public static final Path CALL_LOG = Path.of(ROOT_DIR, "calls_logger.txt");

    private PathUtils() {
    }
}
