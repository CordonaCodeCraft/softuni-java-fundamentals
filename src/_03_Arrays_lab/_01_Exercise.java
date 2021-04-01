/*
Enter a day number [1…7] and print the day name (in English) or "Invalid day!". Use an array of strings.
 */

// Judge ready

package _03_Arrays_lab;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
//        System.out.print("Enter a day number: ");
        int input = Integer.parseInt(s.nextLine());
        if (input > 0 && input <= days.length) {
            input = input - 1;
            System.out.println(days[input]);
        } else {
            System.out.println("Invalid day!");
        }
    }
}

