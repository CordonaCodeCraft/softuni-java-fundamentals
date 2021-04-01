
package _08_ObjectsAndClasses.exercises._07_order_by_age;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Person {
    private String name;
    private String ID;
    private int age;

    public Person(String name, String ID, int age) {
        this.name = name;
        this.ID = ID;
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    public void printPersonData() {
        System.out.printf("%s with ID: %s is %d years old.%n", name, ID, age);
    }
  
}
