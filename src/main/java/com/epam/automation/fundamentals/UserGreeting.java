package com.epam.automation.fundamentals;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        String usersInput = scanner.nextLine();
        System.out.println("Hello " + usersInput);
        scanner.close();
    }
}
