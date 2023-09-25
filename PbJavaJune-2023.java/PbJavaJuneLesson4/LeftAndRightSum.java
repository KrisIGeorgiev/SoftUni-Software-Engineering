package PbJavaJuneLesson4;

import java.util.Scanner;

public class LeftAndRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int right = 0;
        int left = 0;

        for (int number = 1; number <=  n  ; number++) {
            int currentNum = Integer.parseInt(scanner.nextLine());
             left += currentNum;

        }
        for (int number = 1 ;  number <= n ; number++) {
            int currnet = Integer.parseInt(scanner.nextLine());
            right += currnet;


        }
        if(left == right){
            System.out.println("Yes, sum = " + left);
        }else{
            int diff = Math.abs(left - right);
            System.out.println("No, diff = " + diff);
        }
    }
}
