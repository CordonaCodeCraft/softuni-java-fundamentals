/*
The clone factory in Kamino got another order to clone troops.
But this time you are tasked to find the best DNA sequence to use in the production.
You will receive the DNA length and until you receive the command "Clone them!" you will be receiving a DNA sequences of ones and zeroes, split by "!" (one or several).
You should select the sequence with the longest subsequence of ones.
If there are several sequences with same length of subsequence of ones, print the one with the leftmost starting index,
if there are several sequences with same length and starting index, select the sequence with the greater sum of its elements.
*/

// Judge ready

package _03_Arrays_Exercises;

import java.util.Scanner;

public class _09_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
// System.out.print("Enter DNA sequence length: ");
        int col = Integer.parseInt(s.nextLine());
// System.out.print("Enter DNA sequence, or command \"Clone them!\": ");
        String input = s.nextLine();
        int[][] matrix = new int[20][col];

        int currentRow = 0;
        int bestRow = 0;
        int bestSequence = 0;
        int bestSum = 0;
        int bestPosition = 0;

        while (!("Clone them!").equals(input)) {

            boolean bestDNA = false;
            int sequence = 0;
            int position = 0;
            int sum = 0;
            String[] DNA = input.split("[! ]+");

            for (int currentCol = 0; currentCol < DNA.length; currentCol++) {
                matrix[currentRow][currentCol] = Integer.parseInt(DNA[currentCol]);

                if (matrix[currentRow][currentCol] == 1) {
                    sum++;
                }

                if (currentCol != 0) {
                    if (matrix[currentRow][currentCol] == 1 && matrix[currentRow][currentCol - 1] == 1) {
                        sequence++;
                        position = currentCol - 1;
                    }
                }
            }

            if (sequence > bestSequence) {
                bestDNA = true;
            } else if (sequence == bestSequence) {
                if (position < bestPosition) {
                    bestDNA = true;
                } else if (position == bestPosition && sum > bestSum) {
                    bestDNA = true;
                }
            }

            if (bestDNA) {
                bestRow = currentRow;
                bestSequence = sequence;
                bestSum = sum;
                bestPosition = position;
            }

            currentRow++;

// System.out.print("Enter DNA sequence, or command \"Clone them!\": ");
            input = s.nextLine();
        }
        System.out.printf("Best DNA sample %d with sum: %d.%n", bestRow + 1, bestSum);
        for (int result : matrix[bestRow]) {
            System.out.print(result + " ");
        }
    }
}