package FirstStepsInJava;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //целта умножете инчовете по 2.54

        double inches = Double.parseDouble(scanner.nextLine());

        double centimeters = inches * 2.54;

        System.out.println(centimeters);
    }
}
