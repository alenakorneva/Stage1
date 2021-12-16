package com.epam.automation.collections.optionalTaskCollections;

public class MainClass {
    public static void main(String[] args) {
        /*OutputInTheFileInReversedOrder outputInTheFileInReversedOrder = new OutputInTheFileInReversedOrder("task1.txt");
        outputInTheFileInReversedOrder.readFromFile();
        outputInTheFileInReversedOrder.writeInFile();*/

        SortingLinesByLength sortingLinesByLength = new SortingLinesByLength();
        sortingLinesByLength.listInitialization();
        sortingLinesByLength.sortLinesByLength();

        SortingLinesFromFile sortingLinesFromFile = new SortingLinesFromFile("task2.txt");
        sortingLinesFromFile.readFromFile();
        sortingLinesFromFile.sortLinesFromFile();
    }
}
