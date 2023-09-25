package PbJavaJuneLesson2;

import java.util.Scanner;

public class PipesInPoolExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	Първият ред съдържа числото V – Обем на басейна в литри – цяло число в интервала [1…10000].
        //•	Вторият ред съдържа числото P1 – дебит на първата тръба за час – цяло число в интервала [1…5000].
        //•	Третият ред съдържа числото P2 – дебит на втората тръба за час– цяло число в интервала [1…5000].
        //•	Четвъртият ред съдържа числото H – часовете които работникът отсъства – реално число в интервала [1.0…24.00]

        int V = Integer.parseInt(scanner.nextLine());
        int p1 = Integer.parseInt(scanner.nextLine());
        int p2 = Integer.parseInt(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());


        double firstPipe = p1 * h;
        double secondPipe = p2 * h;
        double sum = firstPipe + secondPipe;

        if(sum <= V) {
            double percent = sum / V * 100;
            double percentP1 = ( firstPipe / sum) * 100;
            double percentP2 = (secondPipe / sum) * 100;
            System.out.printf("The pool is %.2f%% full. Pipe 1: %.2f%%. Pipe 2: %.2f%%" , percent , percentP1 , percentP2);
        }else {
            double rest  = Math.abs(V -  sum );
            System.out.printf("For %.2f hours the pool overflows with %.2f liters." , h , rest);

        }
    }
}
