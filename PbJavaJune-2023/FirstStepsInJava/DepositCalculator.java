package FirstStepsInJava;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        double depositSum = Double.parseDouble(scanner.nextLine());
        int timeDeposit = Integer.parseInt(scanner.nextLine());
        double  mortage = Double.parseDouble(scanner.nextLine());
//сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
        double finalSum = depositSum + timeDeposit * ((depositSum * mortage / 100) / 12);

        System.out.println(finalSum);
    }
}
