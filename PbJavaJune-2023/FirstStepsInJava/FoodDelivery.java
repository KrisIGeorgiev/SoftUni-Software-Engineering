package FirstStepsInJava;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int vegetarian = Integer.parseInt(scanner.nextLine());

        //•	Пилешко меню –  10.35 лв.
        //•	Меню с риба – 12.40 лв.
        //•	Вегетарианско меню  – 8.15 лв.

        double price = chicken * 10.35 + fish * 12.40 + vegetarian * 8.15;
        double desert = 0.2 * price;

        double finalPrice = price + desert + 2.50;
        System.out.println(finalPrice);
    }
}
