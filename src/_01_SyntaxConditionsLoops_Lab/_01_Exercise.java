/*
You will be given 3 lines of input – student name, age and average grade.
Your task is to print all the info about the student in the following format: "Name: {student name}, Age: {student age}, Grade: {student grade}".
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи име на студент: ");
        String name = s.nextLine();
//        System.out.print("Въведи възраст: ");
        int age = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи средна оценка: ");
        double avgGrade = Double.parseDouble(s.nextLine());
        System.out.printf("Name: %s, Age: %d, Grade: %.2f", name, age, avgGrade);
    }
}
