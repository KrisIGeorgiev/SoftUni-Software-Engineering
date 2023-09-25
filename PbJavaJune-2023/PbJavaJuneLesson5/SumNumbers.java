package PbJavaJuneLesson5;

import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());
        int input;
        int sum = 0;

        while (true) {
            input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if(sum >= num){
                System.out.println(sum);
                break;
            }
        }
    }
}
