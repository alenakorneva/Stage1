package com.epam.automation.fundamentals;

import java.util.Scanner;

public class CommandLineArgumentsInReversedOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a few symbols");
        String stringInput = scanner.nextLine();
        StringBuilder inputChangedToStringBuilderType = new StringBuilder(stringInput);
        System.out.println(inputChangedToStringBuilderType);
        inputChangedToStringBuilderType.reverse();
        System.out.println(inputChangedToStringBuilderType);
        scanner.close();
    }
}
