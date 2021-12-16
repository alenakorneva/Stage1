package com.epam.automation.fundamentals;

import java.util.Scanner;

public class UserGreeting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your name");
        if (sc.hasNextLine()) {
            String usersInput = sc.nextLine();
            System.out.println("Hello " + usersInput);
        } else System.out.println("no input");
        sc.close();
    }
}
