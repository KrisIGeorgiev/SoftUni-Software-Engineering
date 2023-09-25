package PbJavaJuneLesson1;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Пакет химикали - 5.80 лв.
        //•	Пакет маркери - 7.20 лв.
        //•	Препарат - 1.20 лв (за литър)


        int him = Integer.parseInt(scanner.nextLine());
        int mar = Integer.parseInt(scanner.nextLine());
        int prep = Integer.parseInt(scanner.nextLine());
        int percent = Integer.parseInt(scanner.nextLine());

        double sum = him * 5.80 + mar * 7.20 + prep * 1.20;
        double finalSum = sum - (sum * percent / 100);
        System.out.println(finalSum);


    }
}
