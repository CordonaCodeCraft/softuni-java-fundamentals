// Judge ready

package _05_Text_processing.exercises;

import java.util.Scanner;

public class  _07_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter a string: ");
        String input = s.nextLine();
        StringBuilder product = generateStringBuilder(input);
        int remainingPower = 0;

        for (int index = 0; index < product.length(); index++) {
            char character = product.charAt(index);
            if (Character.isDigit(character)) {
                int explosionStrength = Character.getNumericValue(character) + remainingPower;
                int explosionRange = calculateExplosionRange(product, explosionStrength, index);
                if (explosionStrength > explosionRange) {
                    remainingPower = explosionStrength - 1;
                }
                executeExplosion(product, index, explosionRange);
            }
        }
        System.out.println(product.toString());
    }

    private static StringBuilder generateStringBuilder(String input) {
        StringBuilder builder = new StringBuilder();
        return builder.append(input);
    }

    private static int calculateExplosionRange(StringBuilder product, int explosionStrength, int index) {
        int nextExplosionIndex = product.indexOf(">", index);
        int positionsToNextExplosion = nextExplosionIndex - index;
        int explosionRange = 0;

        if (nextExplosionIndex > 0) {
            if (positionsToNextExplosion < explosionStrength) {
                explosionRange = positionsToNextExplosion;
            }

            if (positionsToNextExplosion >= explosionStrength) {
                explosionRange = explosionStrength;
            }
        } else {
            int finalLength = product.length() - index;
            explosionRange = Math.min(finalLength, explosionStrength);
        }
        return explosionRange;
    }

    private static void executeExplosion(StringBuilder product, int index, int targetLength) {
        product.delete(index, index + targetLength);
    }

}







