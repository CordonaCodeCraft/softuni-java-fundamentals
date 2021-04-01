package _03_Arrays_lab;

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        String[] text = {"one", "two"};
        System.out.println(Arrays.toString(text));
        System.out.println(String.join(", ,", text));
    }
}

