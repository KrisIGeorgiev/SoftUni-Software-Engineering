package PbJavaJuneLesson2;

import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


       //"Action!"
        //
        //o "Wingard starts filming with {останалите пари} leva left."
        double budget = Double.parseDouble(scanner.nextLine());
        int statists = Integer.parseInt(scanner.nextLine());
        double priceClothes = Double.parseDouble(scanner.nextLine());

        double decor = 0.1 * budget;
        double clothing = statists * priceClothes;

        if(statists > 150) {
            clothing = clothing - 0.1 * clothing;

        }
        double sum = decor + clothing;
        if(sum <= budget ) {
            double rest = budget - sum;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left." , rest);
        } else {
            double rest = Math.abs(budget - sum);
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more." , rest);
        }


    }
}
