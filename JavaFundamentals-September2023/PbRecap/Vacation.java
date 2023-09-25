package PbRecap;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = Integer.parseInt(scanner.nextLine());
        String type =  scanner.nextLine();
        String day =  scanner.nextLine();
        double sum = 0;
        double percent = 0;

        if(type.equals("Students")){
            if(day.equals("Friday")){
                sum = 8.45;
            }else if(day.equals("Saturday")){
                sum = 9.80;
            }else if(day.equals("Sunday")) {
                sum = 10.46;
            }
            if(count >= 30){
                percent = 0.15;
            }
        }else if(type.equals("Business")){
            if(day.equals("Friday")){
                sum = 10.9;
            }else if(day.equals("Saturday")){
                sum = 15.60;
            }else if(day.equals("Sunday")) {
                sum = 16;
            }
            if(count >= 100) {
                count-= 10;
            }

        }else if(type.equals("Regular")){
            if(day.equals("Friday")){
                sum = 15;
            }else if(day.equals("Saturday")){
                sum = 20;
            }else if(day.equals("Sunday")) {
                sum = 22.50;
            }
            if(count >= 10 && count <= 20) {
                percent = 0.05;
            }


        }
        double FinalPrice = sum * count - percent * (sum * count);
        System.out.printf("Total price: %.2f", FinalPrice);
    }
}
