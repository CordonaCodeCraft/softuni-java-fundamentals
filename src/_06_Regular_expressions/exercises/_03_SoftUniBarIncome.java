
// Judge ready

package _06_Regular_expressions.exercises;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _03_SoftUniBarIncome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String[] PATTERNS = {"[%]{1}[A-Z][a-z]+[%]{1}", "[<]{1}[\\w]+[>]{1}", "[|]{1}[\\d]+[|]{1}", "[\\d.]+[$]{1}"};
        List<String> tokens = new ArrayList<>();
        double totalIncome = 0;
        while (true) {
            String input = s.nextLine();
            if (input.equals("end of shift")) {
                break;
            } else {
                generateTokens(PATTERNS, tokens, input);
                boolean isValidInput = validateInput(tokens);
                if (isValidInput) {
                    String customer = tokens.get(0).replaceAll("[%]", "");
                    String product = tokens.get(1).replaceAll("[<>]", "");
                    int quantity = Integer.parseInt(tokens.get(2).replaceAll("[|]", ""));
                    double price = Double.parseDouble(tokens.get(3).replaceAll("[$]", ""));
                    double total = quantity * price;
                    totalIncome += total;
                    System.out.printf("%s: %s - %.2f%n", customer, product, total);
                }
                tokens = new ArrayList<>();
            }
        }
        System.out.printf("Total income: %.2f",totalIncome);
    }

    private static void generateTokens(String[] PATTERNS, List<String> tokens, String input) {
        for (String pattern : PATTERNS) {
            Pattern compiled = Pattern.compile(pattern);
            Matcher matcher = compiled.matcher(input);
            if (matcher.find()) {
                String validToken = matcher.group();
                tokens.add(validToken);
            }
        }
    }

    private static boolean validateInput(List<String> tokens) {
        return tokens.size() == 4;
    }
}
