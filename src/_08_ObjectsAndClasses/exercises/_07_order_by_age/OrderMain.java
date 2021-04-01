package _08_ObjectsAndClasses.exercises._07_order_by_age;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class OrderMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        List<Person> personsList = new ArrayList<>();
        while (true) {
//            System.out.print("Enter input: ");
            String input = s.nextLine();

            if (input.equals("End")) {
                break;
            } else {
             populatePersonList(personsList,input);
            }
        }
       List<Person> sortedByAge = personsList.stream()
               .sorted(Comparator.comparing(Person::getAge))
               .collect(Collectors.toList());
         
        printSortedList(sortedByAge);
        
    }

    private static void populatePersonList(List<Person> personsList, String input) {
        String[] tokens = input.split("\\s+");
        String name = tokens[0];
        String ID = tokens[1];
        int age = Integer.parseInt(tokens[2]);
        personsList.add(new Person(name,ID,age));
    }

    private static void printSortedList(List<Person> sortedByAge) {
        for (Person person : sortedByAge) {
            person.printPersonData();
        }
    }
}
