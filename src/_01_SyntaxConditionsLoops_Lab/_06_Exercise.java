/*
Write a program, which prints the language, that a given country speaks.
You can receive only the following combinations:
English is spoken in England and USA; Spanish is spoken in Spain, Argentina and Mexico; for the others, we should print "unknown".
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи име на държава: ");
        String country = s.nextLine();
        switch (country) {
            case "England":
            case "USA":
                System.out.println("English");
                break;
            case "Spain":
            case "Argentina":
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:
                System.out.println("unknown");
        }
    }
}
