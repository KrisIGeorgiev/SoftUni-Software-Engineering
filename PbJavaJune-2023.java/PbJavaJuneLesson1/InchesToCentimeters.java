package PbJavaJuneLesson1;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double inches  = Double.parseDouble(scanner.nextLine());
        double answer = inches * 2.54;
        System.out.println(answer);

    }
}
