package com.epam.automation.collections.optionalTaskCollections;

public class OutputInFileInReversedOrderRunner {
    public static void main(String[] args) {
        OutputInFileInReversedOrder outputInTheFileInReversedOrder = new OutputInFileInReversedOrder("d:\\Stage1\\src\\main\\resources\\task1.txt");
        outputInTheFileInReversedOrder.readFromFile();
        outputInTheFileInReversedOrder.getWordsInLineInReversedOrder();
        outputInTheFileInReversedOrder.writeInFileInReversedOrder();
    }
}
