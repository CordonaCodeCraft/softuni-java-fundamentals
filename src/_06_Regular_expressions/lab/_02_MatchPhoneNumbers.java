
// Judge ready

package _06_Regular_expressions.lab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class _02_MatchPhoneNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String expression = "\\+359([- ])2\\1[\\d]{3}\\1[\\d]{4}\\b";
        Pattern regex = Pattern.compile(expression);
        Matcher matcher = regex.matcher(s.nextLine());
        List<String> product = new ArrayList<>();
        while (matcher.find()) {
            product.add(matcher.group());
        }
        System.out.println(String.join(", ",product));
    }
}
