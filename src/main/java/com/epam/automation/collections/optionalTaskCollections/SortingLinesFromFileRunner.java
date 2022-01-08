package com.epam.automation.collections.optionalTaskCollections;

public class SortingLinesFromFileRunner {
    public static void main (String[] args){
        SortingLinesFromFile sortingLinesFromFile = new SortingLinesFromFile("d:\\Stage1\\src\\main\\resources\\task2.txt");
        sortingLinesFromFile.readFromFile();
        sortingLinesFromFile.sortLinesFromFile();
    }
}
