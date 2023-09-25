package PbJavaJuneLesson5;

import java.util.Scanner;

public class AccountBalance{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double input;
        String end = "";
        double sum = 0;

        while (!end.equals("NoMoreMoney")) {
            end =  scanner.nextLine();
            if(end.equals("NoMoreMoney")){
                System.out.printf("Total: %.2f%n" , sum);
                break;
            }else {
                input = Double.parseDouble(end);
            }

            if(input >= 0){
                sum += input;
                System.out.printf("Increase: %.2f%n" , input);
            } else if(input < 0){
                System.out.println("Invalid operation!");
                System.out.printf("Total: %.2f%n" , sum);
                break;
            }else{
                end = "NoMoreMoney";
            }


        }
    }
}
