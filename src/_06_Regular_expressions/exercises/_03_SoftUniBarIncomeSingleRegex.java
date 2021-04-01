// TODO: 30.05.2020 г. This solution is not ready. Problem in price group
package _06_Regular_expressions.exercises;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_SoftUniBarIncomeSingleRegex {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pattern = "[%]{1}(?<customer>[A-Z][a-z]+)[%]{1}([\\w]+)?[<]{1}(?<product>[\\w]+)[>]{1}([\\w]+)?[|]{1}(?<count>[\\d]+)[|]{1}([\\w]+)?(?<price>[\\d.]+)[$]{1}";
        Pattern compiled = Pattern.compile(pattern);
        double totalIncome = 0;
        while (true) {
            String input = s.nextLine();
            if (input.equals("end of shift")) {
                break;
            } else {
                Matcher matcher = compiled.matcher(input);
                if (matcher.find()) {
                    String customer = matcher.group("customer");
                    String product = matcher.group("product");
                    int count = Integer.parseInt(matcher.group("count"));
                    double price = Double.parseDouble(matcher.group("price"));
                    double total = count * price;
                    totalIncome += total;
                    System.out.printf("%s: %s - %.2f%n", customer, product, total);
                }
            }
        }
        System.out.printf("Total income: %.2f",totalIncome);

    }
}
