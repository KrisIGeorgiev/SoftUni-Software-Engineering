package PbRecap;

import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  scanner.nextLine();
        double coins;
        double sum = 0;
        double cost = 0;

        while (!input.equals("Start")) {

            coins = Double.parseDouble(input);
            if((coins != 0.1) && (coins != 0.2) && (coins != 0.5) && (coins != 1) && (coins != 2)){
                System.out.printf("Cannot accept %.2f%n", coins);
            }else {
                sum += coins;
            }
            input =  scanner.nextLine();
        }
        while (!input.equals("End")){
            input =  scanner.nextLine();
            switch (input){
                case"Nuts":
                    cost = 2;
                    if(sum >= cost){
                        System.out.println("Purchased Nuts");
                        sum -= cost;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case"Water":
                    cost = 0.7;
                    if(sum >= cost){
                        System.out.println("Purchased Water");
                        sum -= cost;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case"Crisps":
                    cost = 1.5;
                    if(sum >= cost){
                        System.out.println("Purchased Crisps");
                        sum -= cost;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case"Soda":
                    cost = 0.8;
                    if(sum >= cost){
                        System.out.println("Purchased Soda");
                        sum -= cost;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case"Coke":
                    cost = 1;
                    if(sum >= cost){
                        System.out.println("Purchased Coke");
                        sum -= cost;
                    }else {
                        System.out.println("Sorry, not enough money");
                    }
                    break;
                case "End":
                    System.out.printf("Change: %.2f", sum);
                    return;
                default:
                    System.out.println("Invalid product");
                    break;
            }

        }

    }
}
