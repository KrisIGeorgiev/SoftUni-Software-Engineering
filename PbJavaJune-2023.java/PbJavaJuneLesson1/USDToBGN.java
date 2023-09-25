package PbJavaJuneLesson1;

import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//1 USD = 1.79549 BGN.
        double dollars = Double.parseDouble(scanner.nextLine());

        double leva = dollars * 1.79549;
        System.out.println(leva);
    }
}
