package com.dudev.IO.practice.task;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class CharactersRunner {
    public static void main(String[] args) throws IOException {
        Path path = Path.of("resources", "poem.txt");
        Path resultPath = Path.of("resources", "characters frequency.txt");
        Files.writeString(resultPath, CharactersHelper.toListRepresentation(CharactersHelper.getCharactersFrequency(path)).toString());


    }
}
