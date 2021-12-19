package com.epam.automation.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheSumOfEnteredNumbers {
    public static void main(String[] args) throws IOException {
        int sum = 0;
        int multiplication = 1;
        ArrayList<Integer> arr = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a few Integers without white space");
        try {
            String stringInput = reader.readLine();
            StringBuilder stringInputChangedToStringBuilderType = new StringBuilder(stringInput);
            for (int i = 0; i < stringInputChangedToStringBuilderType.length(); i++) {
                arr.add(Integer.parseInt(stringInputChangedToStringBuilderType.substring(i, i + 1)));
            }
            for (Integer elem : arr) {
                sum += elem;
                multiplication = multiplication * elem;
            }
            System.out.println(sum);
            System.out.println(multiplication);
        } catch (NumberFormatException e) {
            System.out.println("There're white spaces among your Integers");
        }
    }
}
