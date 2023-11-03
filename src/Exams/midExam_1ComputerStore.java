package Exams;

import java.util.Scanner;

public class midExam_1ComputerStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       String input = "";
       double inputD = 0;
       double sum = 0;
       double tax = 0;

       while (true) {
           input =  scanner.nextLine();
           if(input.equals("regular") || input.equals("special")) {
               break;
           }else {
               inputD = Double.parseDouble(input);
           }
           if(inputD < 0) {
               System.out.println("Invalid price!");
               continue;
           }
               tax += 0.2 * inputD;
               sum += inputD;






        }
        double totalSum = sum + tax;
       if(input.equals("special")) {
           totalSum = totalSum - totalSum * 0.1;
       }
       if(totalSum == 0) {
           System.out.println("Invalid order!");
           return;
       }
        System.out.println("Congratulations you've just bought a new computer!");
        System.out.printf("Price without taxes: %.2f$", sum);
        System.out.printf("%nTaxes: %.2f$%n", tax);
        System.out.println("-----------");
        System.out.printf("Total price: %.2f$", totalSum);



    }
}
