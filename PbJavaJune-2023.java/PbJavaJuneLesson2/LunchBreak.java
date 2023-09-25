package PbJavaJuneLesson2;

import java.util.Scanner;

public class LunchBreak {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String series =  scanner.nextLine();
        int episodeTime = Integer.parseInt(scanner.nextLine());
        int restTime = Integer.parseInt(scanner.nextLine());

        double timeWatch = restTime - (0.125 * restTime  + 0.25 * restTime);

        if(timeWatch >= episodeTime) {
            double rest = Math.ceil(Math.abs(timeWatch - episodeTime));
            System.out.printf("You have enough time to watch %s and left with %.0f minutes free time." , series , rest);
        }else {
            double rest = Math.ceil(Math.abs(timeWatch - episodeTime));
            System.out.printf("You don't have enough time to watch %s, you need %.0f more minutes." , series , rest);
        }

    }
}
