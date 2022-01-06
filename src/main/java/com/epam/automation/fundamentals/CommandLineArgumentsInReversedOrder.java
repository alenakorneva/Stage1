package com.epam.automation.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CommandLineArgumentsInReversedOrder {
    public static void main(String[] args) {
        ArrayList<String> enteredSymbols = new ArrayList<>(Arrays.asList(args));
        for (String symbol : enteredSymbols) {
            System.out.print(symbol + " ");
        }
        System.out.println();
        Collections.reverse(enteredSymbols);
        for (String symbol : enteredSymbols) {
            System.out.print(symbol + " ");
        }
    }
}
