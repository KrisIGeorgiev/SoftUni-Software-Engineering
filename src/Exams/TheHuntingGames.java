package Exams;

import java.util.Scanner;

public class TheHuntingGames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int players = Integer.parseInt(scanner.nextLine());
        double energy = Double.parseDouble(scanner.nextLine());
        double waterPerson = Double.parseDouble(scanner.nextLine());
        double foodPerson = Double.parseDouble(scanner.nextLine());
        double water = waterPerson * players * days;
        double food = foodPerson * players * days;

        for (int i = 1; i <= days; i++) {
            double loss = Double.parseDouble(scanner.nextLine());
            energy -= loss;
            if(energy <= 0) {
                System.out.printf("You will run out of energy. You will be left with %.2f food and %.2f water.", food , water);
                return;
            }
            if(i % 2 == 0) {
                energy += 0.05 * energy;
                water -= 0.3 * water;
            }if(i % 3 == 0) {
                food = food - (food / players);
                energy += 0.1 * energy;
            }

        }
        System.out.printf("You are ready for the quest. You will be left with - %.2f energy!", energy);


    }
}
