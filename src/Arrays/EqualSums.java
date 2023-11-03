package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rightSum = 0;
        int leftSum = 0;

        //index = 3






        int[] arr = Arrays.stream
                (scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();


        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                rightSum += arr[j];

            }
            if(i > 0) {
                for (int j = 0; j < i; j++) {
                    leftSum += arr[j];

                }
            }
            if(rightSum == leftSum) {
                System.out.println(i);
                return;
            }else if(rightSum == 0 && leftSum == 0) {
                System.out.println(0);
                return;
            }
            rightSum = 0;
            leftSum = 0;

            }
        System.out.println("no");
        }


    }

