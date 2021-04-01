/*
Now we will implement more complicated list commands. Again, read a list, and until you receive "end" read commands:
Contains {number} – check if the list contains the number. If yes print "Yes", otherwise print "No such number"
Print even – print all the numbers that are even separated by a space
Print odd – print all the numbers that are odd separated by a space
Get sum – print the sum of all the numbers
Filter ({condition} {number}) – print all the numbers that fulfill that condition. The condition will be either '<', '>', ">=", "<="
 */

// Judge ready

package _07_lists.lab;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of numbers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        while (true) {
//            System.out.print("Enter a command: ");
            String command = s.nextLine();
            if (command.equals("end")) {
                break;
            } else {
                String[] tokens = command.split(" ");
                String trigger = tokens[0];
                switch (trigger) {
                    case "Contains":
                        int contained = Integer.parseInt(tokens[1]);
                        if (input.contains(contained)) {
                            System.out.println("Yes");
                        } else {
                            System.out.println("No such number");
                        }
                        break;
                    case "Print":
                        String type = tokens[1];
                        switch (type) {
                            case "even":
                                for (Integer number : input) {
                                    if (number % 2 == 0) {
                                        System.out.print(number + " ");
                                    }
                                }
                                System.out.println();
                                break;
                            case "odd":
                                for (Integer number : input) {
                                    if (number % 2 != 0) {
                                        System.out.print(number + " ");
                                    }
                                }
                                System.out.println();
                                break;
                        }
                        break;
                    case "Get":
                        int sum = 0;
                        for (Integer digit : input) {
                            sum += digit;
                        }
                        System.out.println(sum);
                        break;
                    case "Filter":
                        String filter = tokens[1];
                        int value = Integer.parseInt(tokens[2]);
                        switch (filter) {
                            case ">=":
                                for (Integer digit : input) {
                                    if (digit >= value) {
                                        System.out.print(digit + " ");
                                    }
                                }
                                System.out.println();
                                break;
                            case "<=":
                                for (Integer digit : input) {
                                    if (digit <= value) {
                                        System.out.print(digit + " ");
                                    }
                                }
                                System.out.println();
                                break;
                            case ">":
                                for (Integer digit : input) {
                                    if (digit > value) {
                                        System.out.print(digit + " ");
                                    }
                                }
                                System.out.println();
                                break;
                            case "<":
                                for (Integer digit : input) {
                                    if (digit < value) {
                                        System.out.print(digit + " ");
                                    }
                                }
                                System.out.println();
                                break;
                        }
                }
            }
        }
    }
}
