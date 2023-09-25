package PbJavaJuneLesson1;

import java.util.Scanner;

public class CircleAreaAndPerimeterExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = Double.parseDouble(scanner.nextLine());
        double lice = Math.PI * r * r;
        double ob = 2 * Math.PI * r;

        System.out.printf("%.2f%n" , lice);
        System.out.printf("%.2f" , ob);

    }
}
