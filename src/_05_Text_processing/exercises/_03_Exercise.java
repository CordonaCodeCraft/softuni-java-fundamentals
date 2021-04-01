/*
Write a program that reads the path to a file and subtracts the file name and its extension.
 */

// Judge ready

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter file path: ");
        String input = s.nextLine();
        int dotIndex = input.lastIndexOf(".");
        int dashIndex = input.lastIndexOf("\\");
        String fileName = input.substring(dashIndex + 1, dotIndex);
        String extension = input.substring(dotIndex + 1);
        System.out.printf("File name: %s%n",fileName);
        System.out.printf("File extension: %s",extension);

    }
}
