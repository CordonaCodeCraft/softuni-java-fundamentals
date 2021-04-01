// Judge ready

package _08_ObjectsAndClasses.exercises._03_opinion_poll;
import java.util.*;
public class PersonMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter number of inputs: ");
        int count = Integer.parseInt(s.nextLine());
        List<Person> personsList = new ArrayList<>();
        List<String> product = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            populatePersonsList(personsList, s.nextLine());
        }

        generateProduct(personsList, product);
        Collections.sort(product);
        System.out.println(String.join(System.lineSeparator(),product));
    }

    private static void generateProduct(List<Person> personsList, List<String> product) {
        for (Person current : personsList) {
            if (current.getAge() > 30) {
                product.add(current.personInfo());
            }
        }
    }


    private static void populatePersonsList(List<Person> personsList, String nextLine) {
        String[] personTokens = nextLine.split("\\s+");
        String firstName = personTokens[0];
        int age = Integer.parseInt(personTokens[1]);
        personsList.add(new Person(firstName, age));
    }
}
