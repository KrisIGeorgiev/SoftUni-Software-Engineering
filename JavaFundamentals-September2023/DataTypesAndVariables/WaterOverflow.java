package DataTypesAndVariables;

import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int capacity = 255;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            int input = Integer.parseInt(scanner.nextLine());
            sum += input;
            if(sum > capacity){
                System.out.println("Insufficient capacity!");
                sum -= input;
            }



        }
        System.out.println(sum);


    }
}
