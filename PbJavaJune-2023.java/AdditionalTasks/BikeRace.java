package AdditionalTasks;

import java.util.Scanner;

public class BikeRace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //juniors	5.50	8	12.25	20
        //seniors	7	9.50	13.75	21.50

        int youngCyclists = Integer.parseInt(scanner.nextLine());
        int oldCyclists = Integer.parseInt(scanner.nextLine());
        String kind =  scanner.nextLine();
        double sum = 0;
        int all = youngCyclists + oldCyclists;
        double percent = 0;

       switch (kind) {
           case "trail":
               sum = oldCyclists * 7 + youngCyclists * 5.50;
               break;
           case "cross-country":
               sum = oldCyclists * 9.50 + youngCyclists * 8 ;
               if(all >= 50) {
                    percent = 0.25;
               }

               break;
           case"downhill":
               sum = oldCyclists * 13.75 + youngCyclists * 12.25;

               break;
           case"road":
               sum = oldCyclists * 21.50 + youngCyclists * 20;

               break;

       }
       double sumFinal = sum - sum * percent ;
       double sumAll = sumFinal - sumFinal * 0.05;
        System.out.printf("%.2f", sumAll);


    }
}
