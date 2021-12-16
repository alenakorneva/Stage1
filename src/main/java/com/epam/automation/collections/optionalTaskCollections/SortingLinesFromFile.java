package com.epam.automation.collections.optionalTaskCollections;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class SortingLinesFromFile {
    ArrayList<String> linesFromFile = new ArrayList<>();
    File file;
    String[] splittedTextFromFile;

    public SortingLinesFromFile(String fileName) {
        this.file = new File(fileName);
    }

    public void readFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String textFromFile = reader.readLine();
            System.out.println(textFromFile);
            splittedTextFromFile = textFromFile.split(" ");
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void sortLinesFromFile() {
        Collections.addAll(linesFromFile, splittedTextFromFile);
        Collections.sort(linesFromFile);
    }
}
