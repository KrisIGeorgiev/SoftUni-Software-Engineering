package PbJavaJuneLesson2;

import java.util.Scanner;

public class TransportPriceExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Такси. Начална такса: 0.70 лв. Дневна тарифа: 0.79 лв. / км. Нощна тарифа: 0.90 лв. / км.
        //•	Автобус. Дневна / нощна тарифа: 0.09 лв. / км. Може да се използва за разстояния минимум 20 км.
        //•	Влак. Дневна / нощна тарифа: 0.06 лв. / км. Може да се използва за разстояния минимум 100 км.

        int n = Integer.parseInt(scanner.nextLine());
        String word = scanner.nextLine();
        double tax = 0;
        double taxa = 0;
        double taxr = 0;

        if (n < 20) {
            if (word.equals("day")) {
                tax = 0.70 + n * 0.79;

            }
            if (word.equals("night")) {
                tax = 0.70 + n * 0.9;
            }
            if (n < 100) {
                System.out.printf("%.2f", tax);
                return;


            }
        }


        if (n >= 20 && n < 100 || n > 100) {
            if (n < 100) {
                if (word.equals("day")) {
                    tax = 0.70 + n * 0.79;

                }
                if (word.equals("night")) {
                    tax = 0.70 + n * 0.9;
                }
                taxa = n * 0.09;
                if (taxa < tax) {
                    System.out.printf("%.2f", taxa);
                    return;
                }
                if (tax > taxa) {
                    System.out.printf("%.2f", tax);
                    return;
                }




            }
            if (n >= 100) {
                taxr = n * 0.06;
                if (word.equals("day")) {
                    tax = 0.70 + n * 0.79;

                }
                if (word.equals("night")) {
                    tax = 0.70 + n * 0.9;
                }
                taxa = n * 0.09;
                if (taxa < tax && taxr > taxa) {
                    System.out.printf("%.2f", taxa);
                    return;
                }else if(tax < taxa && taxr > tax ){
                    System.out.printf("%.2f" , tax);
                     return;
                }else {
                    System.out.printf("%.2f" , taxr);
                    return;
                }




            }
        }
    }
}


