package PbJavaJuneLesson1;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Предпазен найлон - 1.50 лв. за кв. метър
        //•	Боя - 14.50 лв. за литър
        //•	Разредител за боя - 5.00 лв. за литър
        int naylon = Integer.parseInt(scanner.nextLine());
        int boq = Integer.parseInt(scanner.nextLine());
        int raz = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sum = (naylon + 2 ) * 1.50 + (boq + 0.1 * boq) * 14.50  + raz * 5.00 + 0.40;
        double workers = 0.3 * sum * hours;
        double finalSum = sum + workers;
        System.out.println(finalSum);

    }
}
