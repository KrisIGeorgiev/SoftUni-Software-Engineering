package AdditionalTasks;

import java.util.Scanner;

public class MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	От 5 до 9 – 60% от бюджета.
        //•	От 10 до 24 – 50% от бюджета.
        //•	От 25 до 49 – 40% от бюджета.
        //•	50 или повече – 25% от бюджета

        double budget = Double.parseDouble(scanner.nextLine());
        String identification =  scanner.nextLine();
        int group =  Integer.parseInt(scanner.nextLine());
        double budgetAfter = budget;
        double budget1 = 0;

        if(identification.equals("VIP")){
            if(group >=1 && group <= 4) {
                budgetAfter = budget - 0.75 * budget;
            }else if(group >= 5 && group <= 9) {
                budgetAfter = budget - 0.60 * budget;
            }else if(group >= 10 && group <= 24) {
                budgetAfter = budget / 2;

            }else if (group >= 25 && group <= 49) {
                budgetAfter = budget - 0.4 * budget;
            }else {
                budgetAfter = budget - 0.25 * budget;
            }
            budget1 = budgetAfter - group * 499.99;

        }else {
            if(group >=1 && group <= 4) {
                budgetAfter = budget - 0.75 * budget;
            }else if(group >= 5 && group <= 9) {
                budgetAfter = budget - 0.60 * budget;
            }else if(group >= 10 && group <= 24) {
                budgetAfter = budget / 2;

            }else if (group >= 25 && group <= 49) {
                budgetAfter = budget - 0.4 * budget;
            }else {
                budgetAfter = budget - 0.25 * budget;
            }
            budget1= budgetAfter - group * 249.99;


        }

        if(budget1 >= 0) {
            double diff = Math.abs(budget1 - 0);
            System.out.printf("Yes! You have %.2f leva left.", diff);
        }else {
            double diff = Math.abs(budget1 - 0);
            System.out.printf("Not enough money! You need %.2f leva.", diff);
        }
    }
}
