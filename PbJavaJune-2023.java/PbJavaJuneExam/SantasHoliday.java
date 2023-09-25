package PbJavaJuneExam;

import java.util.Scanner;

public class SantasHoliday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int days = Integer.parseInt(scanner.nextLine());
        String accommodation =  scanner.nextLine();
        String grade =  scanner.nextLine();
        int nights = days - 1;
        double sumBegin = 0;
        double percent = 0;
        double sumFinal = 0;

        if(accommodation.equals("room for one person")) {
            sumBegin = nights * 18;
            sumFinal = sumBegin;
        }else if(accommodation.equals("apartment")) {
            sumBegin = nights * 25;
            if(days < 10) {
                percent = 0.3;
            }else if(days >= 10 && days <= 15) {
                percent = 0.35;
            }else if(days > 15) {
                percent = 0.5;
            }
            sumFinal = sumBegin - sumBegin * percent;
        }else if(accommodation.equals("president apartment")) {
            sumBegin = nights * 35;
            if(days < 10) {
                percent = 0.1;
            }else if(days >= 10 && days <= 15) {
                percent = 0.15;
            }else if(days > 15) {
                percent = 0.2;
            }
            sumFinal = sumBegin - sumBegin * percent;
        }
        if(grade.equals("positive")) {
            sumFinal = sumFinal + 0.25 * sumFinal;
        }else {
            sumFinal = sumFinal - 0.1 * sumFinal;
        }
        System.out.printf("%.2f", sumFinal);

    }
}
