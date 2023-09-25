package PbRecap;

import java.util.Scanner;

public class TriangleOfNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int counter = 0;


        for (int i = 1; i <= n ; i++) {
            for (int j = counter; i > j ; j++) {
                System.out.print(i + " ");


            }
            System.out.println();

        }
    }
}
