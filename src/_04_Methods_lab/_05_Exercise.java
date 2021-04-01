/*
Write a method that calculates the total price of an order and prints it on the console.
The method should receive one of the following products: coffee, water, coke, snacks; and a quantity of the product.
The prices for a single piece of each product are:
•	coffee – 1.50
•	water – 1.00
•	coke – 1.40
•	snacks – 2.00
Print the result rounded to the second decimal place.

 */

// Judge ready

package _04_Methods_lab;

import java.util.Scanner;

public class _05_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

//        System.out.print("Enter a drink: ");
        String productType = s.nextLine();
//        System.out.print("Enter quantity: ");
        int quantity = Integer.parseInt(s.nextLine());

        double total = calculateTotalPrice(quantity, productType);

        System.out.printf("%.2f", total);
    }

    private static double calculateTotalPrice(int quantity, String productType)
    {
        double singlePrice = 0;

        switch (productType)
        {
            case "coffee":
                singlePrice = 1.50;
                break;
            case "water":
                singlePrice = 1.00;
                break;
            case "coke":
                singlePrice = 1.40;
                break;
            case "snacks":
                singlePrice = 2.00;
                break;
        }

        return singlePrice * quantity;
    }
}
