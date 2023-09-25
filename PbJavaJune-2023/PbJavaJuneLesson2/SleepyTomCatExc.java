package PbJavaJuneLesson2;

import java.util.Scanner;

public class SleepyTomCatExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Когато е на работа, стопанинът му си играе с него по 63 минути на ден.
        //•	Когато почива, стопанинът му си играе с него  по 127 минути на ден.

        int holiday = Integer.parseInt(scanner.nextLine());

        int workDays  = 365 - holiday;
        int timePlay = workDays * 63 + holiday * 127;

        if(timePlay > 30000) {
            double rest  = timePlay - 30000;
            double hours = Math.floor(rest / 60);
            double minutes = rest % 60;
            System.out.println("Tom will run away");
            System.out.printf("%.0f hours and %.0f minutes more for play" , hours , minutes);
        }else{
            double rest  = Math.abs(timePlay - 30000);
            double hours = Math.floor(rest / 60);
            double minutes = rest % 60;
            System.out.println("Tom sleeps well");
            System.out.printf("%.0f hours and %.0f minutes less for play" , hours , minutes);
        }



    }
}
