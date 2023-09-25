package PbJavaJuneLesson2;

import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        double recSec = Double.parseDouble(scanner.nextLine());
        double meters = Double.parseDouble(scanner.nextLine());
        double time = Double.parseDouble(scanner.nextLine());
        double suprot =  Math.floor(meters / 15) * 12.5;

        double ivanTime = time * meters + suprot;

        if(ivanTime < recSec) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds." , ivanTime);
        }else {
            double rest = Math.abs(recSec - ivanTime);
            System.out.printf("No, he failed! He was %.2f seconds slower." , rest);
        }


    }
}
