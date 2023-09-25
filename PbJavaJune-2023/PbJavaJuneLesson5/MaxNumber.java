package PbJavaJuneLesson5;

import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  "";
        int max = Integer.MIN_VALUE;
        int num;

        while (!input.equals("Stop")) {
            input =  scanner.nextLine();
            if(input.equals("Stop")) {
                System.out.println(max);
                break;
            }else {
                num = Integer.parseInt(input);
            }
            if(num > max) {
                max = num;
            }



        }
    }
}
