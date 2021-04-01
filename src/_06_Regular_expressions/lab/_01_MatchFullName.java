
// Judge ready

package _06_Regular_expressions.lab;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _01_MatchFullName {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = "\\b[A-Z][a-z]+ [A-Z][a-z]+\\b";
        Pattern regex = Pattern.compile(expression);
        String input = s.nextLine();
        Matcher matcher = regex.matcher(input);
        while (matcher.find()) {
            System.out.print(matcher.group() + " ");
        }
    }
}
