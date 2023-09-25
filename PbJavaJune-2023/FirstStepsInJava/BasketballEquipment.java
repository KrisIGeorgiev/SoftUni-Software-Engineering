package FirstStepsInJava;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int yearPay = Integer.parseInt(scanner.nextLine());

        double kecove = yearPay - 0.4 * yearPay;
        double ekip = kecove - kecove * 0.2;
        double ball = 0.25 * ekip;
        double acssesories = 0.2 * ball;
        double price = kecove + ekip + ball + acssesories;

        //•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка

        System.out.println(price + yearPay);
    }
}
