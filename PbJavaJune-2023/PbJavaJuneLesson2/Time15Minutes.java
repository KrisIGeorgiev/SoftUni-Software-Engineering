package PbJavaJuneLesson2;

import java.util.Scanner;

public class Time15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());

        if(minutes >= 45) {
            hours ++;
            minutes = Math.abs(60 - (minutes+ 15));
            if(hours == 24) {
                hours = 0;
            }


        } else {
            minutes = minutes + 15;
        }


        if (minutes < 10) {
            System.out.printf("%d:%02d" , hours , minutes);
        }else
        System.out.printf("%d:%d" , hours , minutes);
    }
}
