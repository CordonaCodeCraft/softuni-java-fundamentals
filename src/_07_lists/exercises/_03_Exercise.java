/*
Write a program that keeps track of the guests that are going to a house party.
On the first input line you are going to receive how many commands you are going to have.
On the next lines you are going to receive some of the following inputs:
-	"{name} is going!"
-	"{name} is not going!"
If you receive the first type of input, you have to add the person if he/she is not in the list.
(If he/she is in the list print on the console: "{name} is already in the list!").
If you receive the second type of input, you have to remove the person if he/she is in the list.
(If not print: "{name} is not in the list!"). At the end print all guests.
 */

// Judge ready

package _07_lists.exercises;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of commands: ");
        int n = Integer.parseInt(s.nextLine());
        List<String> guestList = new ArrayList<>();
        for (int count = 0; count < n; count++) {
//            System.out.print("Enter command: ");
            String[] command = s.nextLine().split(" ");
            String name = command[0];
            boolean inList = guestList.contains(name);
            int trigger = command.length;
            switch (trigger) {
                case 3:
                    if (inList) {
                        System.out.printf("%s is already in the list!%n", name);
                    } else {
                        guestList.add(name);
                    }
                    break;
                case 4:
                    if (inList) {
                        guestList.remove(name);
                    } else {
                        System.out.printf("%s is not in the list!%n", name);
                    }
            }
        }
        printGuestList(guestList);
    }

    private static void printGuestList(List<String> guestList) {
        for (String guest : guestList) {
            System.out.printf("%s%n", guest);
        }
    }
}
