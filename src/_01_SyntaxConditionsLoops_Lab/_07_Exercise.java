/*
A theatre is doing a ticket sale, but they need a program to calculate the price of a single ticket.
If the given age does not fit one of the categories, you should print "Error!".
You can see the prices in the table below:
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи ден: 1) \"Weekday\" 2) \"Weekend\" 3) \"Holiday\": ");
        String day = s.nextLine();
//        System.out.print("Въведи възраст: ");
        int age = Integer.parseInt(s.nextLine());
        int price = 0;
        switch (day) {
            case "Weekday":
                if (0 <= age && age <= 18) {
                    price = 12;
                    break;
                } else if (18 < age && age <= 64) {
                    price = 18;
                    break;
                } else if (64 < age && age <= 122) {
                    price = 12;
                    break;
                }
            case "Weekend":
                if (0 <= age && age <= 18) {
                    price = 15;
                    break;
                } else if (18 < age && age <= 64) {
                    price = 20;
                    break;
                } else if (64 < age && age <= 122) {
                    price = 15;
                    break;
                }
            case "Holiday":
                if (0 <= age && age <= 18) {
                    price = 5;
                    break;
                } else if (18 < age && age <= 64) {
                    price = 12;
                    break;
                } else if (64 < age && age <= 122) {
                    price = 10;
                    break;
                }
        }
        if (age < 0 || age > 122) {
            System.out.println("Error!");
        } else {
            System.out.printf("%d$", price);
        }
    }
}
