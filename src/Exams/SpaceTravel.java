package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SpaceTravel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        int startingFuel = Integer.parseInt(scanner.nextLine());
        int startingAmmo = Integer.parseInt(scanner.nextLine());

        List<String> list = Arrays.stream
                        (input.split("\\|\\|"))
                .collect(Collectors.toList());
        String command = "";
        int number = 0;
        while (true) {
            for (int i = 0; i < list.size(); i++) {


                String[] currentArr = list.get(i).split(" ");
                command = currentArr[0];
                if(command.equals("Titan")) {
                    System.out.println("You have reached Titan, all passengers are safe.");
                    return;
                }else {
                    number = Integer.parseInt(currentArr[1]);
                }

                switch (command) {
                    case "Travel":
                        startingFuel -= number;
                        if (startingFuel >= 0) {
                            System.out.printf("The spaceship travelled %d light-years.%n", number);
                        } else {
                            System.out.println("Mission failed.");
                            return;
                        }
                        break;
                    case "Enemy":
                        if (startingAmmo >= number) {
                            startingAmmo -= number;
                            System.out.printf("An enemy with %d armour is defeated.%n", number);
                        } else {
                            startingFuel -= 2 * number;
                            if (startingFuel >= 0) {
                                System.out.printf("An enemy with %d armour is outmaneuvered.%n", number);

                            } else {
                                System.out.println("Mission failed.");
                                return;
                            }
                        }
                        break;
                    case "Repair":
                        startingFuel += number;
                        startingAmmo += 2 * number;
                        System.out.printf("Ammunitions added: %d.%n", number * 2);
                        System.out.printf("Fuel added: %d.%n", number);
                        break;


                }
            }

        }

    }
}
