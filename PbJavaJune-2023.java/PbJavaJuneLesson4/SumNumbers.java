package PbJavaJuneLesson4;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numNumbers = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        for (int i = 1; i <= numNumbers ; i++ ) {
            int currentNumber = Integer.parseInt(scanner.nextLine());
            sum += currentNumber;


        }
        System.out.println(sum);
    }
}
