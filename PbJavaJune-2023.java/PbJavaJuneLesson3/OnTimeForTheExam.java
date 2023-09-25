package PbJavaJuneLesson3;

import java.util.Scanner;

public class OnTimeForTheExam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"mm minutes before the start" за идване по-рано с по-малко от час.
        //
        //· "hh:mm hours before the start" за подраняване с 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:05.
        //"mm minutes after the start" за закъснение под час.
        //
        //· "hh:mm hours after the start" за закъснение от 1 час или повече. Минутите винаги печатайте с 2 цифри, например 1:03.
        int hb = Integer.parseInt(scanner.nextLine());
        int mb = Integer.parseInt(scanner.nextLine());
        int he = Integer.parseInt(scanner.nextLine());
        int me = Integer.parseInt(scanner.nextLine());
        int difference = 0;

        if(hb == he) {
            if(mb >= me){
                if (Math.abs(mb - me) <= 30) {
                    System.out.println("On time");
                    if(Math.abs(mb - me) != 0) {
                        difference = Math.abs(mb - me);
                        System.out.printf("%d minutes before the start" , difference);
                    }
            }
            }else if( me >= mb) {
                } if(mb - me > 30) {
                    System.out.println("Early");
                    difference = Math.abs(mb - me);
                    System.out.printf("%d minutes before the start" , difference);
                }else {
                    difference = Math.abs(mb - me);
                    System.out.println("Late");
                    System.out.printf("%d minutes after the start" , difference);
                }



        }else if(hb > he){
            int  a = (hb * 60 + mb) - (he * 60 + me);
            if(a <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start" , a);
            }else if(a > 30) {
                System.out.println("Early");
                if(a >= 60) {
                    int min = a % 60;
                    double h = Math.floor(a / 60);
                    if (min < 10) {
                        System.out.printf("%.0f:0%d hours before the start" , h , min);
                    }else {
                        System.out.printf("%.0f:%d hours before the start" , h , min);
                    }

                }else {
                    System.out.printf("%d minutes before the start" , a);
                }
            }
        }else if(he > hb) {
            int  a  = (he * 60 + me) - (hb * 60 + mb);
            if(a <= 30) {
                System.out.println("On time");
                System.out.printf("%d minutes before the start" , a );
            }else if(a > 30) {
                System.out.println("Late");
                if(a >= 60) {
                    int min = a % 60;
                    double h = Math.floor(a / 60);
                    if (min < 10) {
                        System.out.printf("%.0f:0%d hours after the start" , h , min);
                    }else{
                        System.out.printf("%.0f:%d hours after the start" , h , min);
                    }
                }else{
                    System.out.println("Late");

                    System.out.printf("%d minutes after the start" , a);
                }


            }
        }
    }
}
