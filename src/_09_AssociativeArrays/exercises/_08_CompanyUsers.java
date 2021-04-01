
// Judge ready

package _09_AssociativeArrays.exercises;

import java.util.*;

public class _08_CompanyUsers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Map<String, List<String>> companiesDataBase = new HashMap<>();
        while (true) {
            String input = s.nextLine();
            if (input.equals("End")) {
                break;
            } else {
                String[] tokens = input.split(" -> ");
                String company = tokens[0];
                String employerID = tokens[1];
                populateDataBase(companiesDataBase, company, employerID);
            }
        }
        sortCompaniesByName(companiesDataBase);
    }

    private static void populateDataBase(Map<String, List<String>> companiesDataBase, String company, String employerID) {
        companiesDataBase.putIfAbsent(company, new ArrayList<>());
        boolean isRegistered = companiesDataBase.get(company).contains(employerID);
        if (!isRegistered) {
            companiesDataBase.get(company).add(employerID);
        }
    }

    private static void sortCompaniesByName(Map<String, List<String>> companiesDataBase) {
        companiesDataBase
                .entrySet()
                .stream()
                .sorted((left, right) -> left.getKey().compareTo(right.getKey()))
                .forEach(e -> printEntry(e));
    }

    private static void printEntry(Map.Entry<String, List<String>> e) {
        System.out.printf("%s%n", e.getKey());
        e.getValue().forEach(ID -> System.out.printf("-- %s%n", ID));
        }
}
