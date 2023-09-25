package FirstStepsInJava;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());

        double price = cats * 4 + dogs * 2.5;


        System.out.println(price + " lv.");
    }
}
