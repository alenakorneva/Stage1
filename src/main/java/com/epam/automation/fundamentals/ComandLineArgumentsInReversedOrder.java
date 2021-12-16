package com.epam.automation.fundamentals;

import java.util.Scanner;

public class ComandLineArgumentsInReversedOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a few symbols");
        if (sc.hasNextLine()) {
            String input = sc.nextLine();
            StringBuilder sb = new StringBuilder(input);
            System.out.println(sb);
            sb.reverse();
            System.out.println(sb);
        } else System.out.println("no input");
        sc.close();

    }
}
