package PbJavaJuneLesson4;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 1; i <= n  ; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            if(currentNum > max) {
                max = currentNum;
            } if(currentNum < min) {
                min = currentNum;
            }


        }
        System.out.println("Max number: " + max );
        System.out.println("Min number: " + min);
    }
}
