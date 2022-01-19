package com.epam.automation.collections.optionalTaskCollections;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class OutputInFileInReversedOrder {
    private File file;
    private ArrayList<String> linesFromFile = new ArrayList<>();
    private String textFromFileInReversedOrder;

    public OutputInFileInReversedOrder(String fileName) {
        this.file = new File(fileName);
    }

    public void readFromFile() {
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()) {
                linesFromFile.add(scanner.nextLine());
            }
            for (String line : linesFromFile) {
                System.out.println(line);
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }


    public String getWordsInLineInReversedOrder() {
        StringBuilder linesWithWordsInReversedOrder = new StringBuilder();
        for (String line : linesFromFile) {
            StringBuilder wordsInReversedOrder = new StringBuilder();
            String[] wordsFromLine = line.split(" ");
            Collections.reverse(Arrays.asList(wordsFromLine));
            for (String word : wordsFromLine) {
                wordsInReversedOrder.append(word);
                wordsInReversedOrder.append(" ");
            }
            linesWithWordsInReversedOrder.append(wordsInReversedOrder + "\n");
        }
        textFromFileInReversedOrder = linesWithWordsInReversedOrder.toString();
        return textFromFileInReversedOrder;
    }

    public void writeInFileInReversedOrder() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            writer.write(textFromFileInReversedOrder);
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
