/*
Write a method that receives a grade between 2.00 and 6.00 and prints the corresponding grade in words:
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _02_Exercise {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter an grade: ");
        double input = Double.parseDouble(s.nextLine());
        getResult(input);

    }

    private static void getResult(double input) {
        if (input <= 2.00 || input <= 2.99) {
            System.out.println("Fail");
        } else if (input <= 3.00 || input <= 3.49) {
            System.out.println("Poor");
        } else if (input <= 3.50 || input <= 4.49) {
            System.out.println("Good");
        } else if (input <= 4.50 || input <= 5.49) {
            System.out.println("Very good");
        } else if (input <= 5.50 || input <= 600) {
            System.out.println("Excellent");
        }
    }
    
}
