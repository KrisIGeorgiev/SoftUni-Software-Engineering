package Methods;

import java.util.Arrays;
import java.util.Scanner;

public class MultiplyEvensByOdds {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nReal = Math.abs(n);
        int evenSum = 0;
        int oddSum = 0;
        System.out.println(evenDigits(nReal) * oddDigits(nReal));


    }

    public static int evenDigits(int nReal) {
        int evenSum = 0;

       while (nReal > 0) {
           int digit = Math.abs(nReal % 10);
           if(digit % 2 == 0) {
               evenSum += digit;
           }
           nReal /= 10;
       }
        return evenSum;

    }
    public static int oddDigits(int nReal) {
        int oddSum = 0;

        while (nReal > 0) {
            int digit =Math.abs( nReal % 10);
            if(digit % 2 == 1) {
                oddSum += digit;
            }
            nReal /= 10;
        }
        return oddSum;
    }
}


