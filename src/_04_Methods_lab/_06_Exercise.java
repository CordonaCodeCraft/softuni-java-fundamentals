/*
Create a method that calculates and returns the area of a rectangle by given width and length.
 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _06_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter width: ");
        int width = Integer.parseInt(s.nextLine());
//        System.out.print("Enter length: ");
        int height = Integer.parseInt(s.nextLine());

        System.out.printf("%d", calculateRectangleArea(width, height));
    }

    private static int calculateRectangleArea(int width, int length)
    {
        return width * length;
    }
}
