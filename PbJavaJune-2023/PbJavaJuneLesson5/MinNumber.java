package PbJavaJuneLesson5;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input =  "";
        int min = Integer.MAX_VALUE;
        int num;

        while (!input.equals("Stop")) {
            input =  scanner.nextLine();
            if(input.equals("Stop")) {
                System.out.println(min);
                break;
            }else {
                num = Integer.parseInt(input);
            }
            if(num < min) {
                min = num;
            }



        }
    }
    }

