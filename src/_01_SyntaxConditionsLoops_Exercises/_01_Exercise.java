/*
Write a program that determines whether based on the given age a person is: baby, child, teenager, adult, elder. The bounders are:
 */

 // Judge ready

package _01_SyntaxConditionsLoops_Exercises;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter age: ");
        int input = Integer.parseInt(s.nextLine());
        if (input >= 0 && input < 3) {
            System.out.println("baby");
        } else if (input >= 3 && input < 14) {
            System.out.println("child");
        } else if (input >= 14 && input < 20) {
            System.out.println("teenager");
        } else if (input >= 20 && input < 66) {
            System.out.println("adult");
        } else {
            System.out.println("elder");
        }
    }
}
