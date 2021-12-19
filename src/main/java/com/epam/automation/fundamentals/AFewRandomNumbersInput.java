package com.epam.automation.fundamentals;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AFewRandomNumbersInput {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a number");
        int input = Integer.parseInt(reader.readLine());
        for (int i = 0; i < input; i++) {
            System.out.println(Math.random());
        }
        for (int i = 0; i < input; i++) {
            System.out.print(Math.random() + " ");
        }
        reader.close();
    }
}
