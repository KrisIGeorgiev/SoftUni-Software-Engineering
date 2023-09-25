package PbJavaJuneLesson1;

import java.util.Scanner;

public class TrainingLabExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double placesh =  Math.floor((h * 100 - 100) / 70);
        double placesw =  Math.floor((w * 100 / 120)) ;
        double placesall = placesh * placesw -3;
        System.out.printf("%.0f" , placesall);

    }
}
