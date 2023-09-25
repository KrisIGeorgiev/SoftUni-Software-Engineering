package ExamPrep;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Им

        //
        //
        //4. Времетраене на обикновен епизод без рекламите – реално число в диапазона [40.0… 65.0]

        String series =  scanner.nextLine();
        int seasons = Integer.parseInt(scanner.nextLine());
        int episodes = Integer.parseInt(scanner.nextLine());
        double timeEpisode = Double.parseDouble(scanner.nextLine());

        double ads = 0.2 * timeEpisode;

        double timeAll = (seasons * episodes) * (timeEpisode + ads) + 10 * seasons;

        System.out.printf("Total time needed to watch the %s series is %.0f minutes." , series , Math.floor(timeAll));
    }
}
