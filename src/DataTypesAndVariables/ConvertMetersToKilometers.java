package DataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double  n = Double.parseDouble(scanner.nextLine());
        double kilometers = n / 1000;
        System.out.printf("%.2f", kilometers);
    }
}
