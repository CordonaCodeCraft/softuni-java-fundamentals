
// Judge ready

package _08_ObjectsAndClasses.lab;
import java.math.BigInteger;
import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        int input = Integer.parseInt(s.nextLine());
        BigInteger product = calculateFactorial(input);
        System.out.println(product);
    }
    private static BigInteger calculateFactorial(int input) {
        BigInteger factorial = new BigInteger("1");
        for (int i = 1; i <= input; i++) {
            factorial = factorial.multiply(BigInteger.valueOf(i));
        }
        return factorial;
    }
}
