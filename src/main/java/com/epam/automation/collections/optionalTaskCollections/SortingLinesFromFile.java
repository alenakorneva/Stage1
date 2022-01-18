package com.epam.automation.collections.optionalTaskCollections;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortingLinesFromFile {
    private ArrayList<String> linesFromFile = new ArrayList<>();
    private File file;

    public SortingLinesFromFile(String fileName) {
        this.file = new File(fileName);
    }

    public void readFromFile() {
        String lineFromFile;
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                lineFromFile = scanner.nextLine();
                System.out.println(lineFromFile);
                linesFromFile.add(lineFromFile);
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }

    public void sortLinesFromFile() {
        Collections.sort(linesFromFile);
        System.out.println();
        for (String line : linesFromFile) {
            System.out.println(line);
        }
    }
}
