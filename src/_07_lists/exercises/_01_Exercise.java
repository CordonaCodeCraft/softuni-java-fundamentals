/*
On the first line you will be given a list of wagons (integers).
Each integer represents the number of passengers that are currently in each wagon.
On the next line you will get the max capacity of each wagon (single integer).
Until you receive "end" you will be given two types of input:
•	Add {passengers} - add a wagon to the end with the given number of passengers
•	{passengers} -  find an existing wagon to fit all the passengers (starting from the first wagon)
At the end print the final state of the train (all the wagons separated by a space)
 */

// Judge ready

package _07_lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _01_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Generate train: ");
        List<Integer> train = Arrays
                .stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//        System.out.print("Enter max passengers: ");
        int max = Integer.parseInt(s.nextLine());

        while (true) {
//            System.out.print("Enter command: ");
            String command = s.nextLine();
            if (command.equals("end")) {
                break;
            } else {
                if (Character.isDigit(command.charAt(0))) {
                    int passengers = Integer.parseInt(command);
                    for (int index = 0; index < train.size(); index++) {
                        int current = train.get(index);
                        boolean willFit = current + passengers <= max;
                        if (willFit) {
                            train.set(index, current + passengers);
                            break;
                        }
                    }
                } else {
                    String[] tokens = command.split(" ");
                    int passengers = Integer.parseInt(tokens[1]);
                    train.add(passengers);

                }
            }
        }
        printResult(train);


    }

    private static void printResult(List<Integer> train) {
        StringBuilder product = new StringBuilder();
        for (Integer integer : train) {
            product.append(integer).append(" ");
        }
        System.out.println(product.toString());
    }
}
