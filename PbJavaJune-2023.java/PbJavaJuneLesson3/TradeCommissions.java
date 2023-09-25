package PbJavaJuneLesson3;

import java.util.Scanner;

public class TradeCommissions {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city =  scanner.nextLine();
        double tax = Double.parseDouble(scanner.nextLine());
        double percent = 0;


        if(city.equals("Sofia")) {
            if(tax >= 0 && tax  <= 500) {
                percent = 5;
            }else if(tax > 500 && tax <= 1000){
                percent = 7;

            }else if(tax > 1000 && tax <= 10000) {
                percent = 8;
            }else if (tax > 10000) {
                percent = 12;
            }
            else{
                System.out.println("error");
            }
        }else if(city.equals("Varna")) {
            if(tax >= 0 && tax  <= 500) {
                percent = 4.5;
            }else if(tax > 500 && tax <= 1000){
                percent = 7.5;

            }else if(tax > 1000 && tax <= 10000) {
                percent = 10;
            }else if (tax > 10000) {
                percent = 13;
            }else{
                System.out.println("error");
            }
        }else if(city.equals("Plovdiv")) {
            if(tax >= 0 && tax  <= 500) {
                percent = 5.5;
            }else if(tax > 500 && tax <= 1000){
                percent = 8;

            }else if(tax > 1000 && tax <= 10000) {
                percent = 12;
            }else if (tax > 10000) {
                percent = 14.5;
            }else {
                System.out.println("error");
            }
        }else {
            System.out.println("error");
        }
        if(percent > 0) {
            System.out.printf("%.2f" , tax * percent / 100);
        }



    }
}
