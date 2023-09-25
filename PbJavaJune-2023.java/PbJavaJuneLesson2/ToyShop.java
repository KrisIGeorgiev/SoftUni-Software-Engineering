package PbJavaJuneLesson2;

import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Пъзел - 2.60 лв.
        //
        //· Говореща кукла - 3 лв.
        //
        //· Плюшено мече - 4.10 лв.
        //
        //· Миньон - 8.20 лв.
        //
        //· Камионче - 2 лв.

        double cenaexc = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int dolls = Integer.parseInt(scanner.nextLine());
        int bears = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trucks = Integer.parseInt(scanner.nextLine());

        double priceToys = puzzles * 2.60 + dolls * 3 + bears * 4.10 + minions * 8.20 + trucks * 2;
        int count = puzzles + dolls + bears + minions + trucks;
        if(count >= 50) {
            priceToys = priceToys - (priceToys * 0.25);
        }
        priceToys = priceToys - 0.1 * priceToys;

        if(priceToys >= cenaexc) {
            double rest = priceToys - cenaexc;
            System.out.printf("Yes! %.2f lv left." , rest);
        }else {
            double rest = Math.abs(priceToys - cenaexc);
            System.out.printf("Not enough money! %.2f lv needed." , rest);
        }






    }
}
