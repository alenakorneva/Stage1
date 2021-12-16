package com.epam.automation.fundamentals;

import java.util.Scanner;

public class AMonthByANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Integer from 1 to 12");
        if (sc.hasNextInt()) {
            int input = sc.nextInt();
            if (input >= 1 && input <= 12) {
                switch (input) {
                    case 1:
                        System.out.println("Janury");
                        break;
                    case 2:
                        System.out.println("February");
                        break;
                    case 3:
                        System.out.println("March");
                        break;
                    case 4:
                        System.out.println("April");
                        break;
                    case 5:
                        System.out.println("May");
                        break;
                    case 6:
                        System.out.println("June");
                        break;
                    case 7:
                        System.out.println("July");
                        break;
                    case 8:
                        System.out.println("August");
                        break;
                    case 9:
                        System.out.println("September");
                        break;
                    case 10:
                        System.out.println("October");
                        break;
                    case 11:
                        System.out.println("November");
                        break;
                    case 12:
                        System.out.println("December");
                        break;
                }
            } else System.out.println("The Integer isn't among 1 and 12");
        } else System.out.println("The input is not an Integer");
    }
}
