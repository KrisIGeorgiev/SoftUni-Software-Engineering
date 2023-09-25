package PbJavaJuneLesson1;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Дължина в см – цяло число в интервала [10 … 500]
        //2.	Широчина в см – цяло число в интервала [10 … 300]
        //3.	Височина в см – цяло число в интервала [10… 200]
        //4.	Процент  – реално число в интервала [0.000 … 100.000]

        int d = Integer.parseInt(scanner.nextLine());
        int sh = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());

        double obem = d * sh * h;
        double litri = obem * 0.001;
        double sum = litri * (1- percent / 100);
        System.out.println(sum);
    }
}
