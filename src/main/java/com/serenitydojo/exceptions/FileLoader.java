package com.serenitydojo.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;

public class FileLoader {
    public String readHelloWorld() throws IOException {
        try {
            return Files.readString(Paths.get("src/main/resources/hello.txt"));
        } catch(NoSuchFileException noSuchFile){
            String s = "Exception : File not found";
            return s;
        }
    }

    public boolean fileContainsText(String filename, String expectedText) throws IOException {
        String path = "src/main/resources/" + filename;
        try {
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (IOException e) {
            return false;
        }
    }

    public boolean fileHasText(String filename, String expectedText) throws IOException, RuntimeException {
        String path = "src/main/resources/" + filename;
        try {
            return (Files.readString(Paths.get(path)).contains(expectedText));
        } catch (NoSuchFileException noSuchFile) {
            throw new MissingWelcomeFileException("Missing welcome file: " + filename, noSuchFile);
        }
    }
}
