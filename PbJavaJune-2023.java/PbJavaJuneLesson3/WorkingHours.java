package PbJavaJuneLesson3;

import java.util.Scanner;

public class WorkingHours {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hours = Integer.parseInt(scanner.nextLine());
        String day =  scanner.nextLine();

        if(!day.equals("Sunday") && hours >= 10 && hours <= 18) {
            System.out.println("open");

        }else {
            System.out.println("closed");
        }
    }
}
