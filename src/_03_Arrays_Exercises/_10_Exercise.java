package _03_Arrays_Exercises;

import java.util.Scanner;

public class _10_Exercise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
//        System.out.print("Enter length of the field: ");

        int fieldSize = Integer.parseInt(s.nextLine());

        if (fieldSize < 0 || fieldSize > 1000) {
//            System.out.print("Enter length of the field less than 1000 and bigger than 0: ");
            fieldSize = Integer.parseInt(s.nextLine());
        }

        int[] field = new int[fieldSize];

        int counter = 0;

        while (true) {
//            System.out.print("Enter initial positions of the ladybugs: ");
            String[] positions = s.nextLine().split(" ");


            for (String positionS : positions) {
                int position = Integer.parseInt(positionS);
                if (position < 0 || position >= fieldSize) {
                    break;
                } else {
                    field[position] = 1;
                    counter++;
                }
            }
            if (counter == positions.length) {
                counter = 1;
                break;
            }
        }

        while (true) {
//            System.out.print("Enter instruction as \"0 right 1\" or \"end\": ");
            String instruction = s.nextLine();
            counter++;

            if (counter > 100) {
                break;
            }

            if (instruction.equals("end")) {
                break;
            } else {
                String[] flightParameters = instruction.split(" ");

                int targetPosition = Integer.parseInt(flightParameters[0]);
                int flightLength = Integer.parseInt(flightParameters[2]);

                if (targetPosition >= fieldSize || targetPosition < 0) {
                    continue;
                }

                boolean land = false;
                boolean leave = false;
                int nextPosition = 0;

                if (field[targetPosition] == 1) {
                    if (flightParameters[1].equals("right")) {
                        nextPosition = targetPosition + flightLength;
                        if (nextPosition >= fieldSize) {
                            leave = true;
                        } else {
                            if (field[nextPosition] != 1) {
                                land = true;
                            } else {
                                do {
                                    nextPosition += flightLength;
                                    if (nextPosition >= fieldSize) {
                                        leave = true;
                                        break;
                                    } else if (field[nextPosition] != 1) {
                                        land = true;
                                        break;
                                    }
                                } while (field[nextPosition] == 1);
                            }
                        }
                    } else {
                        nextPosition = targetPosition - flightLength;
                        if (nextPosition < 0) {
                            leave = true;
                        } else {
                            if (field[nextPosition] != 1) {
                                land = true;
                            } else {
                                do {
                                    nextPosition -= flightLength;
                                    if (nextPosition < 0) {
                                        leave = true;
                                        break;
                                    } else if (field[nextPosition] != 1) {
                                        land = true;
                                        break;
                                    }
                                } while (field[nextPosition] == 1);
                            }
                        }
                    }

                    if (land) {
                        field[targetPosition] = 0;
                        field[nextPosition] = 1;
                    }

                    if (leave) {
                        field[targetPosition] = 0;
                    }
                }
            }
        }
        for (int result : field) {
            System.out.printf("%d ", result);
        }
    }
}




