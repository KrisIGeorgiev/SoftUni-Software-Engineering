package PbRecap;

import java.util.Scanner;

public class RefactorSumOfOddNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        int sum = 0;
        int counter = 0;
        for (int i = 1; counter < n; i+=2) {
            System.out.println(i);
            sum += i;
            counter++;
        }
        System.out.printf("Sum: %d%n", sum);



    }
}
