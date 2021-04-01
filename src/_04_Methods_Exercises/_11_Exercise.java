package _04_Methods_Exercises;

import java.util.Arrays;
import java.util.Scanner;

public class _11_Exercise
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

//        System.out.print("Enter string of integers: ");
        String input = s.nextLine();
        int[] genericArray = convertStringToArrayOfIntegers(input);
        boolean genericArrayModified = false;

        while (true)
        {
//            System.out.print("Enter a command: ");
            String command = s.nextLine();

            if (!command.equals("end"))
            {
                if (!genericArrayModified)
                {
                    genericArray = convertStringToArrayOfIntegers(input);
                }

                String[] commandsArray = command.split(" ");

                switch (commandsArray[0])
                {
                    case "exchange":

                        boolean indexInRange = Integer.parseInt(commandsArray[1]) < genericArray.length && Integer.parseInt(commandsArray[1]) >= 0;

                        if (!indexInRange)
                        {
                            System.out.println("Invalid index");
                        } else
                        {
                            genericArrayModified = true;
                            genericArray = exchangeSubArrays(genericArray, commandsArray);
                        }

                        break;

                    case "max":

                        switchToEvenOrOdd_Max(genericArray, commandsArray);

                        break;

                    case "min":

                        switchToEvenOrOdd_Min(genericArray, commandsArray);

                        break;

                    case "first":

                        if (Integer.parseInt(commandsArray[1]) > genericArray.length)
                        {
                            System.out.println("Invalid count");
                        } else
                        {
                            switchToEvenOrOdd_First(genericArray, commandsArray);
                        }

                        break;

                    case "last":

                        if (Integer.parseInt(commandsArray[1]) > genericArray.length)
                        {
                            System.out.println("Invalid count");
                        } else
                        {
                            switchToEvenOrOdd_Last(genericArray, commandsArray);
                        }

                        break;
                }
            } else
            {
                System.out.println(Arrays.toString(genericArray));
                break;
            }
        }
    }

    private static void switchToEvenOrOdd_Last(int[] genericArray, String[] commandsArray)
    {
        boolean[] confirmType = confirmEvenOrOdd(genericArray);

        if (commandsArray[2].equals("even"))
        {
            if (confirmType[0])
            {
                findLast(genericArray, commandsArray);

            } else
            {
                System.out.println("[]");
            }

        } else
        {
            if (confirmType[1])
            {
                findLast(genericArray, commandsArray);

            } else
            {
                System.out.println("[]");
            }
        }

    }

    private static void findLast(int[] genericArray, String[] commandsArray)
    {
        int length = Integer.parseInt(commandsArray[1]);
        int[] lasts = new int[length];
        int match = 0;

        if (commandsArray[2].equals("even"))
        {
            for (int currentInteger : genericArray)
            {
                if (currentInteger % 2 == 0)
                {
                    match++;
                }
            }

            if (match == length || match < length)
            {
                match = 0;

                for (int currentInteger : genericArray)
                {
                    if (currentInteger % 2 == 0)
                    {
                        lasts[match] = currentInteger;
                        match++;
                    }

                    if (match == length)
                    {
                        break;
                    }
                }
            } else
            {
                match = length;
                for (int currentIndex = genericArray.length - 1; currentIndex > 0; currentIndex--)
                {
                    if (genericArray[currentIndex] % 2 == 0)
                    {
                        lasts[match - 1] = genericArray[currentIndex];
                        match--;
                    }

                    if (match == 0)
                    {
                        break;
                    }

                }
            }
        } else
        {
            for (int currentInteger : genericArray)
            {
                if (currentInteger % 2 != 0)
                {
                    match++;
                }
            }

            if (match == length || match < length)
            {
                match = 0;

                for (int currentInteger : genericArray)
                {
                    if (currentInteger % 2 != 0)
                    {
                        lasts[match] = currentInteger;
                        match++;
                    }

                    if (match == length)
                    {
                        break;
                    }
                }
            } else
            {
                match = length;
                for (int currentIndex = genericArray.length - 1; currentIndex > 0; currentIndex--)
                {
                    if (genericArray[currentIndex] % 2 != 0)
                    {
                        lasts[match - 1] = genericArray[currentIndex];
                        match--;
                    }

                    if (match == 0)
                    {
                        break;
                    }

                }
            }

        }

        if (lasts[lasts.length - 1] != 0)
        {
            System.out.println(Arrays.toString(lasts));
        } else
        {
            int notZero = 0;

            for (int integer : lasts)
            {
                if (integer != 0)
                {
                    notZero++;
                }
            }

            int[] finalArray = new int[notZero];

            System.arraycopy(lasts, 0, finalArray, 0, finalArray.length);

            System.out.println(Arrays.toString(finalArray));
        }
//        System.out.println(Arrays.toString(lasts));

    }

    private static void switchToEvenOrOdd_First(int[] genericArray, String[] commandsArray)
    {
        boolean[] confirmType = confirmEvenOrOdd(genericArray);

        if (commandsArray[2].equals("even"))
        {
            if (confirmType[0])
            {
                findFirst(genericArray, commandsArray);

            } else
            {
                System.out.println("[]");
            }

        } else
        {
            if (confirmType[1])
            {
                findFirst(genericArray, commandsArray);

            } else
            {
                System.out.println("[]");
            }
        }

    }

    private static void findFirst(int[] genericArray, String[] commandsArray)
    {
        int[] firsts = new int[Integer.parseInt(commandsArray[1])];
        int match = 0;

        for (int currentInteger : genericArray)
        {
            if (commandsArray[2].equals("even"))
            {
                if (currentInteger % 2 == 0)
                {
                    firsts[match] = currentInteger;
                    match++;
                }

                if (match == firsts.length)
                {
                    break;
                }
            } else
            {
                if (currentInteger % 2 != 0)
                {
                    firsts[match] = currentInteger;
                    match++;
                }

                if (match == firsts.length)
                {
                    break;
                }
            }
        }

        if (firsts[firsts.length - 1] != 0)
        {
            System.out.println(Arrays.toString(firsts));
        } else
        {
            int notZero = 0;

            for (int integer : firsts)
            {
                if (integer != 0)
                {
                    notZero++;
                }
            }

            int[] finalArray = new int[notZero];

            System.arraycopy(firsts, 0, finalArray, 0, finalArray.length);

            System.out.println(Arrays.toString(finalArray));
        }

    }

    private static boolean[] confirmEvenOrOdd(int[] genericArray)
    {
        boolean[] confirmEvenOrOdd = new boolean[2];

        for (int integer : genericArray)
        {
            if (integer % 2 == 0)
            {
                confirmEvenOrOdd[0] = true;
            } else
            {
                confirmEvenOrOdd[1] = true;
            }
        }

        return confirmEvenOrOdd;
    }

    private static void switchToEvenOrOdd_Max(int[] genericArray, String[] commandsArray)
    {
        boolean[] confirmType = confirmEvenOrOdd(genericArray);

        if (commandsArray[1].equals("even"))
        {
            if (confirmType[0])
            {
                findMax(genericArray, commandsArray);

            } else
            {
                System.out.println("No matches");
            }
        } else
        {
            if (confirmType[1])
            {
                findMax(genericArray, commandsArray);

            } else
            {
                System.out.println("No matches");
            }
        }

    }

    private static void switchToEvenOrOdd_Min(int[] genericArray, String[] commandsArray)
    {
        boolean[] confirmType = confirmEvenOrOdd(genericArray);

        if (commandsArray[1].equals("even"))
        {
            if (confirmType[0])
            {
                findMin(genericArray, commandsArray);

            } else
            {
                System.out.println("No matches");
            }
        } else
        {
            if (confirmType[1])
            {
                findMin(genericArray, commandsArray);

            } else
            {
                System.out.println("No matches");
            }
        }

    }

    private static void findMin(int[] genericArray, String[] commandsArray)
    {
        int minInteger = Integer.MAX_VALUE;
        int bestIndex = 0;

        for (int currentIndex = 0; currentIndex < genericArray.length; currentIndex++)
        {
            if (genericArray[currentIndex] == minInteger)
            {
                bestIndex = currentIndex;
            }

            if (commandsArray[1].equals("even"))
            {
                if (genericArray[currentIndex] % 2 == 0 && genericArray[currentIndex] < minInteger)
                {
                    minInteger = genericArray[currentIndex];
                    bestIndex = currentIndex;
                }
            } else
            {
                if (genericArray[currentIndex] % 2 != 0 && genericArray[currentIndex] < minInteger)
                {
                    minInteger = genericArray[currentIndex];
                    bestIndex = currentIndex;
                }
            }
        }

        System.out.println(bestIndex);
    }

    private static void findMax(int[] genericArray, String[] commandsArray)
    {
        int maxInteger = Integer.MIN_VALUE;
        int bestIndex = 0;

        for (int currentIndex = 0; currentIndex < genericArray.length; currentIndex++)
        {
            if (genericArray[currentIndex] == maxInteger)
            {
                bestIndex = currentIndex;
            }

            if (commandsArray[1].equals("even"))
            {
                if (genericArray[currentIndex] % 2 == 0 && genericArray[currentIndex] > maxInteger)
                {
                    maxInteger = genericArray[currentIndex];
                    bestIndex = currentIndex;
                }
            } else
            {
                if (genericArray[currentIndex] % 2 != 0 && genericArray[currentIndex] > maxInteger)
                {
                    maxInteger = genericArray[currentIndex];
                    bestIndex = currentIndex;
                }
            }
        }

        System.out.println(bestIndex);
    }

    private static int[] exchangeSubArrays(int[] genericArray, String[] commandsArray)
    {
        int targetIndex = Integer.parseInt(commandsArray[1]) + 1;

        int firstSubArrayLength = genericArray.length - targetIndex;
        int secondSubArrayLength = genericArray.length - firstSubArrayLength;

        int[] firstSubArray = new int[firstSubArrayLength];
        System.arraycopy(genericArray, targetIndex, firstSubArray, 0, firstSubArrayLength);

        int[] secondSubArray = new int[secondSubArrayLength];
        System.arraycopy(genericArray, 0, secondSubArray, 0, secondSubArrayLength);

        int[] modifiedGenericArray = new int[firstSubArrayLength + secondSubArrayLength];
        System.arraycopy(firstSubArray, 0, modifiedGenericArray, 0, firstSubArrayLength);
        System.arraycopy(secondSubArray, 0, modifiedGenericArray, firstSubArrayLength, secondSubArrayLength);

        return modifiedGenericArray;
    }

    private static int[] convertStringToArrayOfIntegers(String input)
    {
        String[] stringsArray = input.split(" ");
        int[] integersArray = new int[stringsArray.length];

        for (int i = 0; i < integersArray.length; i++)
        {
            integersArray[i] = Integer.parseInt(stringsArray[i]);
        }
        return integersArray;
    }

}


