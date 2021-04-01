/*
Write a program that reads sequence of numbers and special bomb number with a certain power.
Your task is to detonate every occurrence of the special bomb number and according to its power - his neighbors from left and right.
Detonations are performed from left to right and all detonated numbers disappear. Finally print the sum of the remaining elements in the sequence.
 */

// TODO: 08.05.2020 г. Judge not ready 75/100

package _07_lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter string of integers: ");
        List<Integer> input = Arrays.stream(s.nextLine().split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
//        System.out.print("Enter trigger and power: ");
        String[] param = s.nextLine().split(" ");
        int bomb = Integer.parseInt(param[0]);
        int power = Integer.parseInt(param[1]);
        int bombIndex = input.indexOf(bomb);

        while (input.contains(bomb)) {
            int sequence = 0;
            int startIndex = 0;

            if (bombIndex == 0) {
                sequence = power + 1;
            } else {
                if (bombIndex - power < 0) {
                    sequence = ((power * 2) + 1) - (power - bombIndex);
                } else {
                    sequence = (power * 2) + 1;
                    startIndex = bombIndex - power;
                }
            }

            doExplosion(input, sequence, startIndex);
        }

        int sum = calculateSum(input);
        System.out.println(sum);
    }

    private static void doExplosion(List<Integer> input, int sequence, int startIndex) {
        for (int cycle = 0; cycle < sequence; cycle++) {
            int lastIndex = input.size() - 1;
            if (startIndex == lastIndex) {
                input.remove(startIndex);
                break;
            } else {
                input.remove(startIndex);
            }
        }
    }

    private static int calculateSum(List<Integer> input) {
        int sum = 0;
        for (Integer integer : input) {
            sum += integer;
        }
        return sum;
    }
}
