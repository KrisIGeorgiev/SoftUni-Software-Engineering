package PbJavaJuneLesson1;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//•	Баскетболни кецове – цената им е 40% по-малка от таксата за една година
//•	Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
//•	Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
//•	Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        int yeartax = Integer.parseInt(scanner.nextLine());
        double kecove = yeartax - 0.4 * yeartax;
        double ekip = kecove - 0.2 * kecove;
        double topka = 0.25 * ekip;
        double acc  = 0.2 * topka;
        double sum = yeartax + kecove + ekip + topka + acc;
        System.out.println(sum);

    }
}
