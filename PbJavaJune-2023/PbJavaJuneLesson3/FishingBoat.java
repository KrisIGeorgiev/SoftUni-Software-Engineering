package PbJavaJuneLesson3;

import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int budget = Integer.parseInt(scanner.nextLine());
        String season =  scanner.nextLine();
        int fishers = Integer.parseInt(scanner.nextLine());
        double percent = 0;
        double percentExc = 0;
        double price = 0;

        //Ако групата е до 6 човека включително – отстъпка от 10%.
        //
        //· Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //
        //· Ако групата е от 12 нагоре – отстъпка от 25%.

        switch (season){
            case"Spring":
                price = 3000;
                if(fishers <= 6){
                    percent = 0.1;
                }else if(fishers >= 7 && fishers <= 11){
                    percent = 0.15;
                }else {
                    percent = 0.25;
                }
                if(fishers % 2 == 0) {
                    percentExc = 0.05;
                }
                break;
            case"Autumn":
            case"Summer":
                price = 4200;
                if(fishers <= 6){
                    percent = 0.1;
                }else if(fishers >= 7 && fishers <= 11){
                    percent = 0.15;
                }else {
                    percent = 0.25;
                }
                if( season.equals("Summer") && fishers % 2 == 0) {
                    percentExc = 0.05;
                }
                break;
            case"Winter":
                price = 2600;
                if(fishers <= 6){
                    percent = 0.1;
                }else if(fishers >= 7 && fishers <= 11){
                    percent = 0.15;
                }else {
                    percent = 0.25;
                }
                if(fishers % 2 == 0) {
                    percentExc = 0.05;
                }
                break;
        }
        double sum = (price - percent * price) - percentExc * (price - percent * price);

        if(sum <= budget) {
            double rest = Math.abs(budget - sum);
            System.out.printf("Yes! You have %.2f leva left." , rest);
        }else {
            double rest = Math.abs(budget - sum);
            System.out.printf("Not enough money! You need %.2f leva." , rest);
        }
    }
}
