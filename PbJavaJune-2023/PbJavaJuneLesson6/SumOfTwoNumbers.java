package PbJavaJuneLesson6;

import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x1 = Integer.parseInt(scanner.nextLine());
        int x2 = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        outerloop:
        for(int i = x1; i <= x2 ; i++) {
            for(int c = x1 ; c <= x2; c++) {
                counter++;
                int sum = i + c;
                if(sum == magic) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", counter , i , c , magic);
                    break outerloop;
                }else if(i == x2 && c == x2) {
                    System.out.printf("%d combinations - neither equals %d", counter , magic);
                    break outerloop;
                }
            }
        }

    }
}
