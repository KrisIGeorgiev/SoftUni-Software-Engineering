package PbJavaJuneExam;

import java.util.Scanner;

public class ChristmasPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Опаковъчна хартия - 5.80 лв. за ролка
        // Плат - 7.20 лв. за ролка
        // Лепило - 1.20 лв. за литъ

        int hartiq = Integer.parseInt(scanner.nextLine());
        int plat = Integer.parseInt(scanner.nextLine());
        double lepilo = Double.parseDouble(scanner.nextLine());
        double percent = Integer.parseInt(scanner.nextLine());
        double percentFinal = percent / 100;

        double sum = hartiq * 5.80 + plat * 7.20 + lepilo * 1.20;
        double finalSum = sum - (percentFinal * sum);
        System.out.printf("%.3f", finalSum);

    }
}
