// Judge ready

package _07_lists.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Generate input: ");
        List<Integer> input = generateList(s.nextLine());
        int sum = 0;
        while (!input.isEmpty()) {
//            System.out.print("Enter index: ");
            int index = Integer.parseInt(s.nextLine());
            int lastIndex = input.size() - 1;
            if (index < 0) {
                index = 0;
                int target = input.get(index);
                sum += target;
                int replacement = input.get(lastIndex);
                input.set(index, replacement);
                modifyWithoutRemove(input, index, target);
            } else if (index > lastIndex) {
                index = lastIndex;
                int target = input.get(index);
                sum += target;
                int replacement = input.get(0);
                input.set(index, replacement);
                modifyWithoutRemove(input, index, target);
            } else {
                int target = input.get(index);
                sum += target;
                modifyList(input, index, target);
            }

        }
        System.out.println(sum);
    }

    private static void modifyWithoutRemove(List<Integer> input, int index, int target) {
        for (int i = 0; i < input.size(); i++) {
            int current = input.get(i);
            if (current <= target) {
                input.set(i, current + target);
            } else {
                input.set(i, current - target);
            }
        }
    }

    private static void modifyList(List<Integer> input, int index, int target) {
        for (int i = 0; i < input.size(); i++) {
            if (i != index) {
                int current = input.get(i);
                if (current <= target) {
                    input.set(i, current + target);
                } else {
                    input.set(i, current - target);
                }
            }
        }
        input.remove(index);
    }

    private static List<Integer> generateList(String nextLine) {
        return Arrays.stream(nextLine.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
