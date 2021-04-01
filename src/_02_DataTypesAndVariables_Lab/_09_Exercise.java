/*
Write program to enter an integer number of centuries and convert it to years, days, hours and minutes.
 */

// Judge ready

package _02_DataTypesAndVariables_Lab;

import java.math.BigDecimal;
import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Въведи брой векове: ");
        int centuries = Integer.parseInt(s.nextLine());
        int years = centuries * 100;
        double days = (int) (years * 365.2422);
        double hours = days * 24;
        double minutes = hours * 60;
        String result = String.format("%d centuries = %d years = %.0f days = %.0f hours = %.0f minutes",centuries, years, days, hours, minutes);
        System.out.println(result);
    }
}
