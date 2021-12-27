package com.epam.automation.collections.optionalTaskCollections;

import java.io.*;

public class OutputInFileInReversedOrder {
    File file;
    String [] splittedTextFromFile;

    public OutputInFileInReversedOrder(String fileName) {
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

    public void writeInFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            StringBuilder wordsInReversedOrder = new StringBuilder();
            for (int i = splittedTextFromFile.length - 1; i >= 0; i--) {
                wordsInReversedOrder.append(splittedTextFromFile[i]);
                wordsInReversedOrder.append(" ");
            }
            System.out.println(wordsInReversedOrder);
            writer.write(String.valueOf(wordsInReversedOrder));

        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
