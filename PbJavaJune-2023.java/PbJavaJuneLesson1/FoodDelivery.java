package PbJavaJuneLesson1;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Пилешко меню –  10.35 лв.
//•	Меню с риба – 12.40 лв.
//•	Вегетарианско меню  – 8.15 лв.
        int chicken = Integer.parseInt(scanner.nextLine());
        int fish = Integer.parseInt(scanner.nextLine());
        int veg = Integer.parseInt(scanner.nextLine());

        double sum = chicken * 10.35 + fish * 12.40 + veg * 8.15;
        double delivery = 0.2 * sum;
        double finalSum = sum + delivery + 2.50;
        System.out.println(finalSum);

    }
}
