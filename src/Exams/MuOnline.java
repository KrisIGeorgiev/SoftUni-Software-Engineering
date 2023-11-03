package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        List<String> n = Arrays.stream
                        (input
                                .split("\\|"))
                .collect(Collectors.toList());

        int health = 100;
        int bitcoins = 0;
        for (int i = 0; i <= n.size() - 1; i++) {
            String[] current = n.get(i).split(" ");
            String command = current[0];
            int index = Integer.parseInt(current[1]);
            if(command.equals("potion")) {

                health += index;
                if(health > 100) {
                    health -= index;
                    index = 100 - health;

                    health = 100;
                }
                System.out.println("You healed for " + index + " hp.");
                System.out.println("Current health: " + health + " hp.");
            }else if(command.equals("chest")) {
                System.out.println("You found " + index + " bitcoins.");
                bitcoins += index;
            }else {
                health -= index;
                if(health > 0) {
                    System.out.println("You slayed " + command + ".");

                }else {
                    System.out.println("You died! Killed by " + command + ".");
                    System.out.println("Best room: " + (i + 1));
                    return;
                }
            }
        }

        System.out.println("You've made it!");
        System.out.println("Bitcoins: " + bitcoins);
        System.out.println("Health: " + health);

    }
}
