/*
Every time Stamat tries to pay his bills he sees on the cash desk the sign: "I will be back in 30 minutes".
One day Stamat was sick of waiting and decided he needs a program, which prints the time after 30 minutes.
That way he won’t have to wait on the desk and come at the appropriate time.
He gave the assignment to you, so you have to do it.
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

import java.util.Scanner;

public class _04_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int hours, minutes, totalMinutes, hourNew, minutesNew;
        String result;
//        System.out.print("Въведи час: ");
        hours = Integer.parseInt(s.nextLine());
//        System.out.print("Въведи минути: ");
        minutes = Integer.parseInt(s.nextLine());
        totalMinutes = (hours * 60) + minutes;
        hourNew = (totalMinutes + 30) / 60 == 24 ? 0 : (totalMinutes + 30) / 60;
        minutesNew = (totalMinutes + 30) % 60;
        result = String.format("%d:%02d", hourNew, minutesNew);
        System.out.println(result);
    }
}
