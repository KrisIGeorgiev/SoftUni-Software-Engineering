package PbJavaJuneLesson1;

import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //2.	Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //3.	Годишен лихвен процент – реално число в интервала [0.00 …100.00]

        double depprice = Double.parseDouble(scanner.nextLine());
        int time = Integer.parseInt(scanner.nextLine());
        double yearprocent = Double.parseDouble(scanner.nextLine());
        //сума = депозирана сума  + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

       double lihva = depprice * yearprocent / 100 ;
       double lihvamesc = lihva / 12;
       double sum = depprice +  time * lihvamesc;
        System.out.printf("%.2f " , sum);
    }
}
