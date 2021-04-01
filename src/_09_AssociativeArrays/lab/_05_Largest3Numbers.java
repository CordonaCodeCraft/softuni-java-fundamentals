
// Judge ready

package _09_AssociativeArrays.lab;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _05_Largest3Numbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Integer> input = Arrays.stream(s.nextLine().split("\\s+"))
        .map(Integer::parseInt)
        .sorted(Comparator.reverseOrder())
        .limit(3)
        .collect(Collectors.toList());
        for (Integer integer : input) {
            System.out.printf("%d ", integer);
        }
    }
}
