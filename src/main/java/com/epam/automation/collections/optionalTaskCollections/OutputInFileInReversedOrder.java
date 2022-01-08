package com.epam.automation.collections.optionalTaskCollections;

import java.io.*;
import java.util.*;

public class OutputInFileInReversedOrder {
    private File file;
    ArrayList <String> linesFromFile = new ArrayList<>();

    public OutputInFileInReversedOrder(String fileName) {
        this.file = new File(fileName);
    }

    public void readFromFile() {
        try (Scanner scanner = new Scanner(new FileReader(file))) {
            while (scanner.hasNextLine()){
               linesFromFile.add(scanner.nextLine());
            }
            for (String line : linesFromFile){
                System.out.println(line);
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }


    public String getWordsInLineInReversedOrder(String line){
        StringBuilder wordsInReversedOrder = new StringBuilder();
        String [] wordsFromLine = line.split(" ");
        Collections.reverse(Arrays.asList(wordsFromLine));
        for (String word : wordsFromLine){
            wordsInReversedOrder.append(word);
            wordsInReversedOrder.append(" ");
        }
        return wordsInReversedOrder.toString();
    }

    public void writeInFileInReversedOrder() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
            for (String line : linesFromFile){
                writer.write(getWordsInLineInReversedOrder(line) + "\n");
            }
        } catch (IOException | RuntimeException e) {
            e.printStackTrace();
        }
    }
}
