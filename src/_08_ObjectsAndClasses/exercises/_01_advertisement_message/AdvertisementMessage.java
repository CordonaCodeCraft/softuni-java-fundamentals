
// Judge ready

package _08_ObjectsAndClasses.exercises._01_advertisement_message;

import java.util.Random;
import java.util.Scanner;

public class AdvertisementMessage {
    public static void main(String[] args) {
        final String[] PHRASES = {"Excellent product.", "Such a great product.", "I always use that product.",
                "Best product of its category.", "Exceptional product.", "I can’t live without this product."};
        final String[] EVENTS = {"Now I feel good.", "I have succeeded with this product.", "Makes miracles. I am happy of the results!",
                "I cannot believe but now I feel awesome.", "Try it yourself, I am very satisfied.", "I feel great!"};
        final String[] AUTHORS = {"Diana", "Petya", "Stella", "Elena", "Katya", "Iva", "Annie", "Eva"};
        final String[] CITIES = {"Burgas", "Sofia", "Plovdiv", "Varna", "Ruse"};
        Scanner s = new Scanner(System.in);
        Random rnd = new Random();
        int messageCount = Integer.parseInt(s.nextLine());
        for (int i = 0; i < messageCount; i++) {
            int phrasesIndex = rnd.nextInt(PHRASES.length);
            int eventsIndex = rnd.nextInt(EVENTS.length);
            int authorsIndex = rnd.nextInt(AUTHORS.length);
            int citiesIndex = rnd.nextInt(CITIES.length);
            System.out.printf("%s %s %s - %s%n", PHRASES[phrasesIndex], EVENTS[eventsIndex], AUTHORS[authorsIndex], CITIES[citiesIndex]);
        }
    }
}
