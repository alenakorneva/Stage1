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
            String s = reader.readLine();
            StringBuilder sb = new StringBuilder(s);
            for (int i = 0; i < sb.length(); i++) {
                arr.add(Integer.parseInt(sb.substring(i, i + 1)));
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