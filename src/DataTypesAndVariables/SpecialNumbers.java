package DataTypesAndVariables;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        int real = 1;
        int i = real;


        for (; real <= n ; real++) {
            i = real;

            sum = 0;
            while ( i > 0 ){
                int lastDigit = i % 10;
                sum += lastDigit;
                i /= 10;
            }
            if(sum == 5 || sum == 7 || sum == 11) {
                System.out.printf("%d -> True%n" , real);
            }else {
                System.out.printf("%d -> False%n", real);
            }


        }

    }
}
