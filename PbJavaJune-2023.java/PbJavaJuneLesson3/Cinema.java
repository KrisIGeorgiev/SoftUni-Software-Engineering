package PbJavaJuneLesson3;

import java.util.Scanner;

public class Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Premiere – премиерна прожекция, на цена 12.00 лева.
        //
        //· Normal – стандартна прожекция, на цена 7.50 лева.
        //
        //· Discount – прожекция за деца, ученици и студенти на намалена цена от 5.00 лева
        String kind =  scanner.nextLine();
        int r = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());

        int places = r * c;
        double price = 0;

        if(kind.equals("Premiere")) {
            price = 12;

        }else if(kind.equals("Normal")) {
            price = 7.50;
        }else if(kind.equals("Discount")) {
            price = 5;
        }
        double sum = price * places;

        System.out.printf("%.2f leva" , sum);



    }
}
