package PbJavaJuneLesson5;

import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Широчина на свободното пространство - цяло число в интервала [1...1000]
        //2.	Дължина на свободното пространство - цяло число в интервала [1...1000]
        //3.	Височина на свободното пространство - цяло число в интервала [1...1000]
        //4.	На следващите редове (до получаване на команда "Done") - брой кашони, които се пренасят в квартирата - цяло число в интервала [1...10000]
        //Програмата трябва да приключи прочитането на данни при команда "Done" или ако свободното място свърши.

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());
        int space = width * length * height;
        int sum = 0;

        while (true) {
            String input =  scanner.nextLine();
            if(input.equals("Done")) {
                if(space > sum) {
                    int diff = Math.abs(sum - space);
                    System.out.printf("%d Cubic meters left." , diff);
                    break;
                }

            }
            int cartons = Integer.parseInt(input);
             sum += cartons;
             if(sum >= space) {
                 int diff = Math.abs(sum - space);
                 System.out.printf("No more free space! You need %d Cubic meters more." , diff);
                 break;
             }

        }
    }
}
