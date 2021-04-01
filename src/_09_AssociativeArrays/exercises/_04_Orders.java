
// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.Scanner;
import java.util.List;
import java.util.Map;
import java.util.LinkedHashMap;
import java.util.ArrayList;

public class _04_Orders {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<Double>> orders = new LinkedHashMap<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("buy")) {
                break;
            } else {
                String[] tokens = input.split("\\s+");
                String product = tokens[0];
                double price = Double.parseDouble(tokens[1]);
                double quantity = Integer.parseInt(tokens[2]);
                addToOrders(orders, product, price, quantity);
            }
        }
        print(orders);
    }

    private static void addToOrders(Map<String, List<Double>> orders, String product, double price, double quantity) {
        if (!orders.containsKey(product)) {
            orders.put(product, new ArrayList<>());
            orders.get(product).add(price);
            orders.get(product).add(quantity);
        } else {
            double currentQuantity = orders.get(product).get(1);
            orders.get(product).set(0, price);
            orders.get(product).set(1, currentQuantity + quantity);
        }
    }

    private static void print(Map<String, List<Double>> orders) {
        for (String product : orders.keySet()) {
            double price = orders.get(product).get(0);
            double quantity = orders.get(product).get(1);
            double total = price * quantity;
            System.out.printf("%s -> %.2f%n", product, total);

        }
    }

}

