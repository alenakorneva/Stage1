package com.epam.automation.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class RandomNumbersInput {
    public static void main(String[] args) {
        ArrayList<String> commandLineInput = new ArrayList<>(Arrays.asList(args));
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        int integerInput = 0;
        if (isParsable(commandLineInput.get(0))) {
            integerInput = Integer.parseInt(commandLineInput.get(0));
        } else System.out.println("The input is not a number");
        for (int i = 0; i < integerInput; i++) {
            randomNumbers.add((int) (Math.random() * 10));
            System.out.println(randomNumbers.get(i));
        }
        for (int i = 0; i < integerInput; i++) {
            System.out.print(randomNumbers.get(i) + " ");
        }
    }

    public static boolean isParsable(String input) {
        try {
            Integer.parseInt(input);
            return true;
        } catch (final NumberFormatException e) {
            return false;
        }
    }
}
