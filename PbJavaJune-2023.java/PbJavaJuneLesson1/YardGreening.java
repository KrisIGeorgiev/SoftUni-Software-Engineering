package PbJavaJuneLesson1;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double meters = Double.parseDouble(scanner.nextLine());
        double price = meters * 7.61;
        double discount = 0.18 * price;
        double finalPrice = price - discount;
        //"The final price is: {крайна цена на услугата} lv."
        //
        //· "The discount is: {отстъпка} lv."
        System.out.println("The final price is: " + finalPrice + " lv.");
        System.out.println("The discount is: " + discount + " lv.");
    }
}
