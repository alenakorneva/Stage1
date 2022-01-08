package com.epam.automation.collections.optionalTaskCollections;

import java.io.*;
import java.util.*;

public class SortingLinesFromFile {
    ArrayList<String> linesFromFile = new ArrayList<>();
    String lineFromFile;
    private File file;

    public SortingLinesFromFile(String fileName) {
        this.file = new File(fileName);
    }

    public void readFromFile() {
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
