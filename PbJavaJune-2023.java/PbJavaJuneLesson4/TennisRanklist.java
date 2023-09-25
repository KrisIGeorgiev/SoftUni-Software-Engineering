package PbJavaJuneLesson4;

import java.util.Scanner;

public class TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int pointsBe = Integer.parseInt(scanner.nextLine());
        //W - ако е победител получава 2000 точки
        //
        //§ F - ако е финалист получава 1200 точки
        //
        //§ SF - ако е полуфиналист получава 720 точки
        int points = 0;
        int pw = 0;

        for (int i = 1; i <= tournaments ; i++) {
            String outcome =  scanner.nextLine();
            if(outcome.equals("W")) {
                points += 2000;
                pw++;
            }else if(outcome.equals("F")) {
                points += 1200;
            }else if(outcome.equals("SF")) {
                points += 720;
            }

        }
        int pointsAll = points + pointsBe;
        double average = Math.floor(points * 1.0 / tournaments);
        double wins = pw * 1.0 / tournaments * 100;
        System.out.printf("Final points: %d%n" , pointsAll);
        System.out.printf("Average points: %.0f%n" , average);
        System.out.printf("%.2f%%%n" , wins);

    }
}
