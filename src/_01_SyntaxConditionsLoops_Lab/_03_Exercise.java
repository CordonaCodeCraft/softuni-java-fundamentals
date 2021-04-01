/*
Modify the above program, so it will print "Failed!" if the grade is lower than 3.00.
 */

// Judge ready

package _01_SyntaxConditionsLoops_Lab;

        import java.util.Scanner;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double i = s.nextDouble();
        if (i >= 3) {
            System.out.println("Passed!");
        } else {
            System.out.println("Failed!");
        }
    }
}
