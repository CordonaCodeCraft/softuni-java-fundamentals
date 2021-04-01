/*
Write a method that receives a single string and prints the count of the vowels.
Use appropriate name for the method.
 */

// Judge ready

package _04_Methods_Exercises;

import java.util.Scanner;

public class _02_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string: ");
        String[] input = s.nextLine().split("");
        int countVowels = countVowelsInString(input);
        System.out.println(countVowels);
    }

    private static int countVowelsInString(String[] input)
    {
        int countVowels = 0;

        for (String letter : input)
        {
            switch (letter)
            {
                case "a" :
                case "e" :
                case "i" :
                case "o" :
                case "u" :
                case "y" :
                case "A" :
                case "E" :
                case "I" :
                case "O" :
                case "U" :
                case "Y" :
                    countVowels++;
                    break;
            }
            
        }
        return  countVowels;
    }
    
}
