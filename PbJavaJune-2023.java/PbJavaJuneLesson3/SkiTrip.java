package PbJavaJuneLesson3;

import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Първи ред - дни за престой - цяло число в интервала [0...365]
        //
        //· Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //
        //· Трети ред - оценка - "positive" или "negative"

        int days = Integer.parseInt(scanner.nextLine());
        String accommodation =  scanner.nextLine();
        String grade =  scanner.nextLine();
        double sale = 0;
        double price = 0;
        int nights = days - 1;

        if(days < 9 ) {
            if(accommodation.equals("room for one person")) {
                sale = 0;
                 price = 18 * nights;

            }else if(accommodation.equals("apartment")) {
                sale = 0.3;
                price =  25 * nights;
            }else if(accommodation.equals("president apartment")) {
                sale = 0.1;
                price = 35 * nights;

            }
        }else if(days >= 10 && days<= 15 ) {
            if(accommodation.equals("room for one person")) {
                sale = 0;
                price = 18 * nights;

            }else if(accommodation.equals("apartment")) {
                sale = 0.35;
                price =  25 * nights;
            }else if(accommodation.equals("president apartment")) {
                sale = 0.15;
                price = 35 * nights;

            }
        }else if(days > 15) {
            if(accommodation.equals("room for one person")) {
                sale = 0;
                price = 18 * nights;

            }else if(accommodation.equals("apartment")) {
                sale = 0.50;
                price =  25 * nights;
            }else if(accommodation.equals("president apartment")) {
                sale = 0.20;
                price = 35 * nights;

            }
        }
        double sum = price - price * sale;
        if(grade.equals("positive")) {
            sum = sum + 0.25 * sum;
        }else if(grade.equals("negative")) {
            sum = sum - 0.1 * sum;
        }
        System.out.printf("%.2f" , sum);
    }
}
