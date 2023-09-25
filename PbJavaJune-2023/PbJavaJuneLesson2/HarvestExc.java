package PbJavaJuneLesson2;

import java.util.Scanner;

public class HarvestExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //•	2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //•	3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //•	4ти ред: брой работници – цяло число в интервала [1 … 20]

        int x = Integer.parseInt(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        int z = Integer.parseInt(scanner.nextLine());
        int workers = Integer.parseInt(scanner.nextLine());

        double kgGrape = 0.4 * x * y;
        double litersWine =  (kgGrape / 2.5);

        if(litersWine < z){
            double rest = Math.floor(Math.abs(litersWine - z));
            System.out.printf("It will be a tough winter! More %.0f liters wine needed." , rest);
        } else {
            double litersWine2 = Math.floor(litersWine);
            double rest = Math.ceil(Math.abs(litersWine - z));
            double wineWorker = Math.ceil(rest / workers);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n" , litersWine2);
            System.out.printf("%.0f liters left -> %.0f liters per person.%n" , rest , wineWorker);
        }


    }
}
