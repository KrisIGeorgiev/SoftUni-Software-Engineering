package PbJavaJuneExam;

import java.util.Scanner;

public class HairSalon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Подстригване (haircut):
        //o Мъжко (mens) - 15лв.
        //o Дамско (ladies) – 20лв.
        //o Детско (kids) – 10лв.
        // Боядисване (color):
        //o Поддръжка (touch up) – 20лв.
        //o Пълно боядисване (full color) – 30лв.

        int goal = Integer.parseInt(scanner.nextLine());
        String input = "";
        String kind = "";
        int money = 0;

        while (!input.equals("closed")) {
            input =  scanner.nextLine();
            if(input.equals("closed")) {
                int diff = Math.abs(money - goal);
                System.out.printf("Target not reached! You need %dlv. more.%n", diff);
                System.out.printf("Earned money: %dlv.%n", money);
                break;
            } else if(input.equals("haircut")) {
                kind =  scanner.nextLine();
                if(kind.equals("mens")) {
                    money += 15;
                }else if(kind.equals("ladies")){
                    money += 20;
                }else if(kind.equals("kids")){
                    money += 10;
                }
            }else if(input.equals("color")) {
                kind =  scanner.nextLine();
                if(kind.equals("touch up")) {
                    money += 20;
                }else if(kind.equals("full color")) {
                    money += 30;
                }
            }

            if(money >= goal) {
                System.out.println("You have reached your target for the day!");
                System.out.printf("Earned money: %dlv.%n", money);
                break;
            }



        }
    }
}
