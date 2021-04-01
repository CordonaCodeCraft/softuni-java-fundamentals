// TODO: 18.04.2020 г. Not Solved !!! 

package _05_Text_processing.exercises;

import java.util.Scanner;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        String input = s.nextLine();
        System.out.print("Enter an multiplier: ");
        String multiplier = s.nextLine();
        int length = input.length();
        long result = 0;
        int builderLength = 1;



        for (int i = length - 1; i >= 0; i--) {
            int inputNumber = Character.getNumericValue(input.charAt(i));
            String constructedNumber = constructNumber(inputNumber, builderLength);
            result += Long.parseLong(constructedNumber) * Integer.parseInt(multiplier);
            builderLength++;
        }
        System.out.println(result);
    }

    private static String constructNumber(int inputNumber, int builderLength) {
        StringBuilder constructor = new StringBuilder(inputNumber);
        constructor.append(inputNumber);
        if (builderLength > 1) {
            while (builderLength > 1) {
                constructor.append("0");
                builderLength--;
            }
        }
        return constructor.toString();
    }
}