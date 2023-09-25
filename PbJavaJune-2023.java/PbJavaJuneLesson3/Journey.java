package PbJavaJuneLesson3;

import java.util.Scanner;

public class Journey {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season =  scanner.nextLine();
        String place = "ni";
        double percent = 0;
        String accommodation = "ni";
        //При 100лв. или по-малко – някъде в България
        //
        //o Лято – 30% от бюджета
        //
        //o Зима – 70% от бюджета
        //
        //· При 1000лв. или по малко – някъде на Балканите
        //
        //o Лято – 40% от бюджета
        //
        //o Зима – 80% от бюджета
        //
        //· При повече от 1000лв. – някъде из Европа
        //
        //o При пътуване из Европа, независимо от сезона ще похарчи 90% от бюджета.


        if(budget <= 100) {
            place = "Bulgaria";
            if(season.equals("summer")){
                percent = 0.3;
                accommodation = "Camp";
            }else if(season.equals("winter")) {
                percent = 0.7;
                accommodation = "Hotel";
            }

        }else if(budget <= 1000) {
            place = "Balkans";
            if(season.equals("summer")){
                percent = 0.4;
                accommodation = "Camp";
            }else if(season.equals("winter")) {
                percent = 0.8;
                accommodation = "Hotel";
            }


        }else if(budget > 1000){
            place = "Europe";
            accommodation = "Hotel";
            percent = 0.9;
        }
        double sum = budget * percent;
        System.out.printf("Somewhere in %s%n" , place);
        System.out.printf("%s - %.2f" , accommodation , sum);
    }
}
