package PbJavaJuneLesson1;

import java.util.Scanner;

public class HousePaintingExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //zelena 1l = 3.4m
        //chervena 1l = 4,3m

        double x = Double.parseDouble(scanner.nextLine());
        double y = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());

        double prednaIzadnaStena = (x * x) * 2 - (1.2 * 2);
        double stranichniSteni = (x * y) * 2 - (1.5 * 1.5) * 2;
        double steni = prednaIzadnaStena + stranichniSteni;

        double pokriv = 2 * (x * y) + 2 * ((x * h) / 2);
        double zelenaboq = steni / 3.4;
        double chervenaboq = pokriv / 4.3;

        System.out.printf("%.2f%n" , zelenaboq);
        System.out.printf("%.2f%n" , chervenaboq);

    }
}
