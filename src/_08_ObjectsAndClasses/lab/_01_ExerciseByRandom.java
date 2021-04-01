package _08_ObjectsAndClasses.lab;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class _01_ExerciseByRandom {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        String[] input = s.nextLine().split("\\s+");
        Random rnd = new Random();
        ArrayList<Integer> usedIndexes = new ArrayList<>();
        for (int i = 0; i < input.length; i++) {
            int randomIndex = rnd.nextInt(input.length);
            boolean indexUsed = usedIndexes.contains(randomIndex);
            if (!indexUsed) {
                usedIndexes.add(randomIndex);
                String word = input[randomIndex];
                System.out.println(word);
            } else {
                i--;
            }
        }
    }
}
