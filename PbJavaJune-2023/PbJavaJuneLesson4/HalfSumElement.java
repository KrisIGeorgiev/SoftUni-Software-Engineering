package PbJavaJuneLesson4;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
            sum+= currentNum;

            if(currentNum > max) {
                max = currentNum;

            }
        }
        if(max == sum - max) {
            System.out.println("Yes");
            System.out.println("Sum = " + max);
        }else {
            int diff = Math.abs(sum - max - max);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
