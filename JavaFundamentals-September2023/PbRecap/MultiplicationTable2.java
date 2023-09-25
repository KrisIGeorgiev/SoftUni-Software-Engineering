package PbRecap;

import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int mult = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        do{
            sum = n * mult;
            System.out.printf("%d X %d = %d%n", n , mult , sum);
           mult++;

        }while (mult <= 10); {



        }
    }
}
