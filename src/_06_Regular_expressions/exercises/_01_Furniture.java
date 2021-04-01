
// Judge ready

package _06_Regular_expressions.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_Furniture {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = "[>]{2}(?<furniture>[A-Za-z]+)[<]{2}(?<price>[\\d.]+)[!]{1}(?<quantity>[\\d]+)";
        Pattern regex = Pattern.compile(expression);
        List<String> furnitureList = new ArrayList<>();
        double total = 0;
        while (true) {
            String input = s.nextLine();
            if (input.equals("Purchase")) {
                break;
            } else {
                Matcher matcher = regex.matcher(input);
                if (matcher.find()) {
                    String furniture = matcher.group("furniture");
                    double price = Double.parseDouble(matcher.group("price"));
                    int quantity = Integer.parseInt(matcher.group("quantity"));
                    furnitureList.add(furniture);
                    total = addToTotal(total, price, quantity);
                }
            }
        }
        printResult(furnitureList,total);
    }

    private static void printResult(List<String> furnitureList, double total)  {
        System.out.println("Bought furniture: ");
        furnitureList.forEach(System.out::println);
        System.out.printf("Total money spend: %.2f", total);
    }

    private static double addToTotal(double total, double price, int quantity)  {
        return total += price * (quantity * 1.);
    }
}
