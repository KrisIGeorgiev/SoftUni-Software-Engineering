package FirstStepsInJava;


import java.util.Scanner;

public class USDToBGN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double dollars = Double.parseDouble(scanner.nextLine());

        double converted = dollars * 1.79549;
        System.out.println(converted);
    }
}
