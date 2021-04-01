
// Judge ready

package _09_AssociativeArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class _04_WordFilter {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] input = Arrays.stream(s.nextLine().split("\\s+"))
                .filter(w -> w.length() % 2 == 0)
                .toArray(String[]::new);

        for (String word : input) {
            System.out.println(word);

        }
    }
}
