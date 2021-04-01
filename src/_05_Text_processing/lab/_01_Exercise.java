/*
You will be given series of strings until you receive an "end" command.
Write a program that reverses strings and prints each pair on separate line in format "{word} = {reversed word}".
 */

// Judge ready

package _05_Text_processing.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        while (true) {
//            System.out.print("Enter a word or command \"end\": ");
            String input = s.nextLine();
            if (input.equals("end")) {
                break;
            } else {
                String reversed = reverseInput(input);
                System.out.printf("%s = %s%n", input, reversed);
            }
        }
    }

    private static String reverseInput(String input) {
        String reversed = "";

        for (int index = input.length() - 1; index >= 0; index--) {
            reversed += input.charAt(index); 
        }

        return reversed;
    }
}
