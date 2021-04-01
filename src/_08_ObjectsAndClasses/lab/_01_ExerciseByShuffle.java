// Judge ready

package _08_ObjectsAndClasses.lab;

import java.util.*;
import java.util.stream.Collectors;

public class _01_ExerciseByShuffle {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        List<String> input = generateList(s.nextLine());
        Collections.shuffle(input);
        printInput(input);
    }

    private static List<String> generateList(String nextLine) {
        return Arrays
                .stream(nextLine.split("\\s+"))
                .collect(Collectors.toList());
    }

    private static void printInput(List<String> input) {
        for (String word : input) {
            System.out.println(word);
        }
    }
}
