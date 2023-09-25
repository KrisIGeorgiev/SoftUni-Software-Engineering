package PbJavaJuneLesson4;

import java.util.Scanner;

public class Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actor =  scanner.nextLine();
        double pointsAcad = Double.parseDouble(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        double sumPoints = pointsAcad;


        for (int i = 1; i <= n; i++) {
            String judge =  scanner.nextLine();
            double pointsJu = Double.parseDouble(scanner.nextLine());

            sumPoints += (judge.length() * pointsJu) / 2;

            if(sumPoints > 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!" , actor , sumPoints);
                break;
            }if(i == n && sumPoints < 1250.5) {
                double rest = Math.abs(sumPoints - 1250.5);
                System.out.printf("Sorry, %s you need %.1f more!" , actor , rest);

            }

        }
    }
}
