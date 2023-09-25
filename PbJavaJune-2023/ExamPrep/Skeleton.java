package ExamPrep;

import java.util.Scanner;

public class Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Минути на контролата – цяло число в интервала [0…59]
        //
        //2. Секунди на контролата – цяло число в интервала [0…59]
        //
        //3. Дължината на улея в метри – реално число в интервала [0.00…50000]
        //
        //4. Секунди за изминаване на 100 метра – цяло число в интервала [0…1000]

        int control = Integer.parseInt(scanner.nextLine());
        int seconds = Integer.parseInt(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        int seconds100meters = Integer.parseInt(scanner.nextLine());

        int controlSeconds = control * 60 + seconds;
        double slowing = (width / 120) * 2.5;
        double time = (width / 100) * seconds100meters - slowing;
        if(time <= controlSeconds) {
            //"Marin Bangiev won an Olympic quota!"
            //
            //o "His time is {времето на Марин в секунди}.
            System.out.println("Marin Bangiev won an Olympic quota!");
            System.out.printf("His time is %.3f." , time);
        }else {
            double diff = Math.abs(controlSeconds - time);
            System.out.printf("No, Marin failed! He was %.3f second slower." , diff);
        }
    }
}
