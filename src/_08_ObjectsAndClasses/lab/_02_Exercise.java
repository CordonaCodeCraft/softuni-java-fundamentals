
// Judge ready

package _08_ObjectsAndClasses.lab;

import java.math.BigInteger;
import java.util.Scanner;

public class _02_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter first number: ");
        BigInteger firstNumber = new BigInteger(s.nextLine());
//        System.out.print("Enter second number: ");
        BigInteger secondNumber = new BigInteger(s.nextLine());
        BigInteger result = firstNumber.add(secondNumber);
        System.out.println(result);

        
    }
}
