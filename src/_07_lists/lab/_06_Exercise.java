/*
Read a number n and n lines of products.
Print a numbered list of all the products ordered by name.
 */

// Judge ready

package _07_lists.lab;

import java.util.*;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of inputs: ");
        int n = Integer.parseInt(s.nextLine());
        List<String> collection = new ArrayList<>();
        for (int i = 0; i < n; i++) {
//            System.out.print("Enter product name: ");
            collection.add(s.nextLine());
        }
        Collections.sort(collection);
        printSorted(collection);


    }

    private static void printSorted(List<String> collection) {
        int count = 1;
        for (String product : collection) {
            System.out.printf("%d.%s%n", count, product);
            count++;

        }


    }
}
