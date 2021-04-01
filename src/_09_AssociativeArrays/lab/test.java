package _09_AssociativeArrays.lab;

import java.util.Arrays;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] test = s.nextLine().split(" ");
        int[] integers = new int[test.length];
        for (int i = 0; i < test.length; i++) {
            integers[i] = Integer.parseInt(test[i]);
        }
        System.out.println(Arrays.toString(integers));
    }
}
