package Exams;

import java.util.Scanner;

public class GuineaPig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double quantityFood = Double.parseDouble(scanner.nextLine()) ;
        double quantityHay = Double.parseDouble(scanner.nextLine()) ;
        double quantityCover = Double.parseDouble(scanner.nextLine()) ;
        double weight = Double.parseDouble(scanner.nextLine());



        for (int i = 1; i <= 30; i++) {

            quantityFood -= 0.3;
            if(i % 2 == 0 ) {
                double neededHay = quantityFood * 0.05;
                quantityHay -= neededHay;
            } if(i % 3 == 0) {
                quantityCover -= weight / 3;

            }
            if(quantityFood <= 0 || quantityHay <= 0 || quantityCover <= 0) {
                System.out.println("Merry must go to the pet store!");
                return;
            }


        }


            System.out.printf("Everything is fine! Puppy is happy! Food: %.2f, Hay: %.2f, Cover: %.2f.", quantityFood , quantityHay, quantityCover);

    }
}
