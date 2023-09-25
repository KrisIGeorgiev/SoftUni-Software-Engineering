package PbJavaJuneLesson2;

import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Видеокарта – 250 лв./бр.
        //
        //· Процесор – 35% от цената на закупените видеокарти/бр.
        //
        //· Рам памет – 10% от цената на закупените видеокарти/бр.

        double budget = Double.parseDouble(scanner.nextLine());
        int videoCards = Integer.parseInt(scanner.nextLine());
        int cpu = Integer.parseInt(scanner.nextLine());
        int ram = Integer.parseInt(scanner.nextLine());
        double sumCards = videoCards * 250;

        double sum = sumCards + cpu * (0.35 *  sumCards) + ram * (0.1 * sumCards);

        if(videoCards > cpu) {
            sum = sum - (0.15 * sum);
        }

        if(sum <= budget) {
            double rest = Math.abs(budget - sum);
            System.out.printf("You have %.2f leva left!" , rest);
        } else {
            double rest = Math.abs(budget - sum);
            System.out.printf("Not enough money! You need %.2f leva more!" , rest);
        }


    }
}
