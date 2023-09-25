package PbJavaJuneExam;

import java.util.Scanner;

public class MaidenParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Любовно послание - 0.60 лв.
        // Восъчна роза - 7.20 лв.
        // Ключодържател - 3.60 лв.
        // Карикатура - 18.20 лв.
        // Късмет изненада - 22 лв.

        double priceParty = Double.parseDouble(scanner.nextLine());
        int love = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int keyholders = Integer.parseInt(scanner.nextLine());
        int caricatures = Integer.parseInt(scanner.nextLine());
        int surprise = Integer.parseInt(scanner.nextLine());
        int count = love + roses + keyholders + caricatures + surprise;
        double percent = 0;

        double sum = love * 0.60 + roses * 7.20 + keyholders * 3.60 + caricatures * 18.20 + surprise * 22;

        if(count > 25) {
             percent = 0.35;
        }
        double sumPercent = sum - percent * sum;
        double Final = sumPercent - 0.1 * sumPercent;

        if (Final >= priceParty) {
            double diff = Math.abs(Final - priceParty);
            System.out.printf("Yes! %.2f lv left.", diff);
        }else {
            double diff = Math.abs(Final - priceParty);
            System.out.printf("Not enough money! %.2f lv needed.", diff);
        }


    }
}
