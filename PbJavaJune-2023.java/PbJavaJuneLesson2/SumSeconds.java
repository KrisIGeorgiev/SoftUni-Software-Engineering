package PbJavaJuneLesson2;

import java.util.Scanner;

public class SumSeconds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int c = Integer.parseInt(scanner.nextLine());
        int total = a + b + c;

        int  minutes = (total) / 60;
        int  seconds = total % 60;

        if(seconds < 10) {
            System.out.printf("%d:0%d" , minutes , seconds);

        }else {
            System.out.printf("%d:%d" , minutes , seconds);

        }



    }
}
