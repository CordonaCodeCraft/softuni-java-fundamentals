/*
You will be given two hands of cards, which will be integer numbers.
Assume that you have two players.
You have to find out the winning deck and respectively the winner.
You start from the beginning of both hands.
Compare the cards from the first deck to the cards from the second deck.
The player, who has bigger card, takes both cards and puts them at the back of his hand - the second player's card is last,
and the first person's card (the winning one) is before it (second to last) and the player with smaller card must remove the card from his deck.
If both players' cards have the same values - no one wins, and the two cards must be removed from the decks.
The game is over when one of the decks is left without any cards.
You have to print the winner on the console and the sum of the left cards: "Player {one/two} wins! Sum: {sum}".
 */

// Judge ready

package _07_lists.exercises;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _06_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Generate first deck: ");
        List<Integer> firstDeck = generateDeck(s.nextLine());
//        System.out.print("Generate second deck: ");
        List<Integer> secondDeck = generateDeck(s.nextLine());

        while (!firstDeck.isEmpty() && !secondDeck.isEmpty()) {
            int firstHand = firstDeck.get(0);
            int secondHand = secondDeck.get(0);

            if (firstHand == secondHand) {
                clearDecks(firstDeck, secondDeck);

            } else {
                if (firstHand > secondHand) {
                    firstDeck.add(firstHand);
                    firstDeck.add(secondHand);
                    clearDecks(firstDeck, secondDeck);


                } else {
                    secondDeck.add(secondHand);
                    secondDeck.add(firstHand);
                    clearDecks(firstDeck, secondDeck);
                }
            }
        }
        int result = calculateResult(firstDeck, secondDeck);

        if (firstDeck.isEmpty()) {
            System.out.printf("Second player wins! Sum: %d", result);
        } else {
            System.out.printf("First player wins! Sum: %d", result);
        }
    }

    private static List<Integer> generateDeck(String nextLine) {
        List<Integer> deck = new ArrayList<>();
        deck = Arrays.stream(nextLine.split(" "))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        return deck;
    }

    private static void clearDecks(List<Integer> firstDeck, List<Integer> secondDeck) {
        firstDeck.remove(0);
        secondDeck.remove(0);
    }

    private static int calculateResult(List<Integer> firstDeck, List<Integer> secondDeck) {
        int result = 0;
        if (firstDeck.isEmpty()) {
            for (Integer integer : secondDeck) {
                result += integer;
            }
        } else {
            for (Integer integer : firstDeck) {
                result += integer;
            }
        }
        return result;
    }
}
