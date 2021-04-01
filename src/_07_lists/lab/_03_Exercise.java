/*
You are going to receive two lists with numbers.
Create a result list which contains the numbers from both of the lists.
The first element should be from the first list, the second from the second list and so on.
If the length of the two lists are not equal, just add the remaining elements at the end of the list.
 */

// Judge ready

package _07_lists.lab;
import java.util.*;
import java.util.stream.Collectors;

public class _03_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.println("Enter first string of numbers:");
        List<Integer> firstList = generateListOfIntegers(s.nextLine());
//        System.out.println("Enter first string of numbers:");
        List<Integer> secondList = generateListOfIntegers(s.nextLine());
        List<Integer> product = new ArrayList<>();
        int firstSize = firstList.size();
        int secondSize = secondList.size();
        int min = Math.min(firstSize, secondSize);

        for (int index = 0; index < min; index++) {
            product.add(firstList.get(index));
            product.add(secondList.get(index));
            if (index == min - 1) {
                if (firstSize == min) {
                    product.addAll(getLeftovers(min, secondList, secondSize));
                } else {
                    product.addAll(getLeftovers(min, firstList, firstSize));
                }
            }
        }
        String result = convertListToString(product);
        System.out.println(result);

    }

    private static List<Integer> generateListOfIntegers(String nextLine) {
        return Arrays.stream(nextLine.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }

    private static List<Integer> getLeftovers(int min, List<Integer> secondList, int secondSize) {
        List<Integer> leftovers = new ArrayList<>();
        for (int i = min; i < secondSize; i++) {
            leftovers.add(secondList.get(i));
        }
        return leftovers;
    }

    private static String convertListToString(List<Integer> product) {
        StringBuilder result = new StringBuilder();
        for (Integer integer : product) {
            result.append(integer).append(" ");
        }
        return result.toString();
    }
}
