package PbJavaJuneLesson4;

import java.util.Scanner;

public class CleverLily {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Възрастта на Лили - цяло число в интервала [1...77]
        //
        //· Цената на пералнята - число в интервала [1.00...10 000.00]
        //
        //· Единична цена на играчка - цяло число в интервала [0
        int ageLily = Integer.parseInt(scanner.nextLine());
        double priceWashing = Double.parseDouble(scanner.nextLine());
        int toy = Integer.parseInt(scanner.nextLine());
        int toys = 0;
        int moneyLily = 0;
        int change = 9;


        for (int i = 1; i <= ageLily ; i++) {
            if(!((i % 2) == 0)) {
                toys++;
            }else {
                moneyLily += change;
                change += 10;
            }

        }
        int sumToys = toys * toy;
        int allSum = sumToys + moneyLily;

        if(allSum >= priceWashing) {
            double rest = Math.abs(allSum - priceWashing);
            System.out.printf("Yes! %.2f" , rest);
        }else {
            double rest = Math.abs(allSum - priceWashing);
            System.out.printf("No! %.2f" , rest);
        }
    }
}
