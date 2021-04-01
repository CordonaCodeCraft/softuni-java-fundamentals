package _09_AssociativeArrays.exercises;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
    String test = "Ivan Ivanov -> Lighter";
        String user = test.substring(0, test.indexOf("-") - 1);
        String forceType = test.substring(test.indexOf(">") + 2);
        System.out.println(user);
        System.out.println(forceType);
    
    }
}


