// Judge ready

package _07_lists.exercises;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter input: ");
        List<String> input = generateList(s.nextLine());

        while (true) {
//            System.out.print("Enter command: ");
            String command = s.nextLine();
            if (command.equals("course start")) {
                break;
            } else {
                String[] tokens = command.split(":");
                String trigger = tokens[0];
                String title = tokens[1];
                String exercise = String.format("%s-Exercise", title);
                boolean titleExists = input.contains(title);
                boolean exerciseExists = input.contains(exercise);
                switch (trigger) {
                    case "Add":
                        if (!titleExists) {
                            input.add(title);
                        }
                        break;
                    case "Insert":
                        int targetIndex = Integer.parseInt(tokens[2]);
                        if (!titleExists) {
                            input.add(targetIndex, title);
                        }
                        break;
                    case "Remove":
                        if (titleExists && exerciseExists) {
                            input.remove(title);
                            input.remove(exercise);
                        } else if (titleExists) {
                            input.remove(title);
                        }
                        break;
                    case "Swap":
                        String secondTitle = tokens[2];
                        boolean bothTitlesExist = titleExists && input.contains(secondTitle);
                        if (bothTitlesExist) {
                            int titleIndex = input.indexOf(title);
                            int secondTitleIndex = input.indexOf(secondTitle);
                            String swapState = analiseSwapParameters(input, titleIndex, secondTitleIndex);
                            executeSwap(input, title, secondTitle, swapState);
                        }
                        break;
                    case "Exercise":
                        if (titleExists) {
                            if (!exerciseExists) {
                                addExercise(input, title, exercise);
                            }
                        } else {
                            addTitleAndExercise(input, title, exercise);
                        }

                }
            }
//            System.out.println(input);
        }
        printResult(input);
    }

    private static List<String> generateList(String nextLine) {
        return Arrays.stream(nextLine.split(", "))
                .map(String::valueOf)
                .collect(Collectors.toList());
    }

    private static String analiseSwapParameters(List<String> input, int titleIndex, int secondTitleIndex) {
        String elementAfterFirstTitle = "";
        String elementAfterSecondTitle = "";

        if (titleIndex == input.size() - 1) {
            elementAfterFirstTitle = "";
        } else {
            elementAfterFirstTitle = input.get(titleIndex + 1);
        }

        if (secondTitleIndex == input.size() - 1) {
            elementAfterSecondTitle = "";
        } else {
            elementAfterSecondTitle = input.get(secondTitleIndex + 1);
        }
        String[] secondElements = {elementAfterFirstTitle, elementAfterSecondTitle};

        int exercisesCount = 0;
        boolean firstTitleHasExercise = false;

        for (int i = 0; i < secondElements.length; i++) {
            if (secondElements[i].contains("Exercise")) {
                exercisesCount++;
                if (i == 0) {
                    firstTitleHasExercise = true;
                }
            }
        }
        String swapState = "";

        if (exercisesCount == 0) {
            swapState = "Exercises not found";
        } else if (exercisesCount == 2) {
            swapState = "Both titles have exercise";
        } else {
            if (firstTitleHasExercise) {
                swapState = "First title has exercise";
            } else {
                swapState = "Second title has exercise";
            }
        }
        return swapState;
    }

    private static void executeSwap(List<String> input, String title, String secondTitle, String swapState) {
        int titleIndex = input.indexOf(title);
        int secondTitleIndex = input.indexOf(secondTitle);
        switch (swapState) {
            case "Exercises not found":
                swapTitles(input, titleIndex, secondTitleIndex, title, secondTitle);
                break;
            case "Both titles have exercise":
                String firstExercise = input.get(titleIndex + 1);
                String secondExercise = input.get(secondTitleIndex + 1);
                swapTitles(input, titleIndex, secondTitleIndex, title, secondTitle);
                input.set(titleIndex + 1, secondExercise);
                input.set(secondTitleIndex + 1, firstExercise);
                break;
            case "First title has exercise":
                firstExercise = input.get(titleIndex + 1);
                swapTitles(input, titleIndex, secondTitleIndex, title, secondTitle);
                input.add(secondTitleIndex + 1, firstExercise);
                input.remove(firstExercise);
                break;
            case "Second title has exercise":
                secondExercise = input.get(secondTitleIndex + 1);
                swapTitles(input, titleIndex, secondTitleIndex, title, secondTitle);
                input.add(titleIndex + 1, secondExercise);
                input.remove(input.lastIndexOf(secondExercise));
                break;
        }
    }

    private static void swapTitles(List<String> input, int titleIndex, int secondTitleIndex, String title, String secondTitle) {
        input.set(titleIndex, secondTitle);
        input.set(secondTitleIndex, title);
    }

    private static void addExercise(List<String> input, String title, String exercise) {
        int titleIndex = input.indexOf(title);
        input.add(titleIndex + 1, exercise);
    }

    private static void addTitleAndExercise(List<String> input, String title, String exercise) {
        input.add(title);
        input.add(exercise);
    }

    private static void printResult(List<String> input) {
        for (int i = 0; i < input.size(); i++) {
            System.out.printf("%d.%s%n", i + 1, input.get(i));
        }
    }
}
