package com.epam.automation.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class TheSumOfEnteredNumbers {
    public static void main(String[] args) {
        int sum = 0;
        int multiplication = 1;
        ArrayList<Integer> integerInput = new ArrayList<>();
        System.out.println("Enter a few Integers");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String[] stringInputs = reader.readLine().split(" ");
            for (String stringInput : stringInputs) {
                integerInput.add(Integer.parseInt(stringInput));
            }
            for (Integer elem : integerInput) {
                sum += elem;
                multiplication = multiplication * elem;
            }
            System.out.println(sum);
            System.out.println(multiplication);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
