package PbJavaJuneLesson1;

import java.util.Scanner;

public class VegetableMarketExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първи ред – Цена за килограм зеленчуци – реално число[0.00… 1000.00]
        //•	Втори ред – Цена за килограм плодове – реално число[0.00… 1000.00]
        //•	Трети ред – Общо килограми на зеленчуците – цяло число[0… 1000]
        //•	Четвърти ред – Общо килограми на плодовете – цяло число[0… 1000]

        double priceVegetables = Double.parseDouble(scanner.nextLine());
        double priceFruits = Double.parseDouble(scanner.nextLine());
        int kgVegetables  = Integer.parseInt(scanner.nextLine());
        int kgFruits = Integer.parseInt(scanner.nextLine());

        double priceLeva = (kgVegetables * priceVegetables) + (kgFruits * priceFruits);
        double priceEuro = priceLeva / 1.94;
        System.out.printf("%.2f" , priceEuro);

    }
}
