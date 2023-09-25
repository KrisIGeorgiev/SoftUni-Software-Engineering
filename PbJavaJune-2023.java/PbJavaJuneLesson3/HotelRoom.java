package PbJavaJuneLesson3;

import java.util.Scanner;

public class HotelRoom {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String month =  scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());
        double priceS = 0;
        double priceA = 0;
        double percentS = 0;
        double percentA = 0;

        switch (month){
            case "May":
            case"October":
                if (nights > 7 && nights < 14 ) {
                    percentS = 0.05;

                }else if(nights > 14) {
                    percentS = 0.3;
                }
                priceS = nights * 50 - percentS *(nights * 50);

                if(nights > 14) {
                    percentA = 0.1;
                }
                priceA = nights * 65 - percentA *(nights * 65);
                break;
            case"June":
            case"September":


                 if(nights > 14) {
                    percentS = 0.2;
                }
                priceS = nights * 75.20 - percentS *(nights * 75.20);

                if(nights > 14) {
                    percentA = 0.1;
                }
                priceA = nights * 68.7 - percentA *(nights * 68.7);
                break;
            case"July":
            case"August":

                priceS = nights * 76;
                if(nights > 14) {
                    percentA = 0.1;
                }
                priceA = nights * 77 - percentA *(nights * 77);


        }
        System.out.printf("Apartment: %.2f lv.%n" , priceA);
        System.out.printf("Studio: %.2f lv.%n" , priceS);


    }
}
