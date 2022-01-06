package com.epam.automation.fundamentals;

import java.util.ArrayList;
import java.util.Arrays;

public class SumOfEnteredNumbers {
    public static void main(String[] args) {
        ArrayList<String> commandLineArguments = new ArrayList<>(Arrays.asList(args));
        ArrayList<Integer> numbersForAdditionAndMultiplication = new ArrayList<>();
        int sum = 0;
        int multiplication = 1;
        for (String commandLineArgument : commandLineArguments) {
            if (isParsable(commandLineArgument)) {
                numbersForAdditionAndMultiplication.add(Integer.parseInt(commandLineArgument));
            } else System.out.println("The input is not a number");
        }
        for (Integer elem : numbersForAdditionAndMultiplication) {
            sum += elem;
            multiplication = multiplication * elem;
        }
        System.out.println("The sum of entered numbers is " + sum);
        System.out.println("The multiplication of entered numbers is " + multiplication);
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
