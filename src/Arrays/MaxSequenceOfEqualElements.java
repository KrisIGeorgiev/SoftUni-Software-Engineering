package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MaxSequenceOfEqualElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int check = Integer.MIN_VALUE;
        int index = 0;

        int[] arr = Arrays.stream
                (scanner.nextLine().split(" "))
                .mapToInt((e -> Integer.parseInt(e)))
                .toArray();
        int j = 0;
        int lastNumber = 76465574;
        for (int i = 0; i < arr.length - 1; i++) {
            int counter = 1;
            int currentNumber = arr[i];
            do {
                j= i + 1;
                if (currentNumber == arr[j]) {
                    counter++;
                }

            }while (currentNumber != arr[j]);

            if(counter > check){
               check = counter;
                index = i;
           }




        }
        for (int i = 0; i < check  ; i++) {
            System.out.print(arr[index] + " ");

        }
// int [] array = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(e -> Integer.parseInt(e)).toArray();
//        int maxLength = 0;
//        int length = 1;
//
//        int startIndex = 0;
//        int bestStart = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if(array[i] == array[i - 1]) {
//                length++;
//            } else {
//                length = 1;
//                startIndex = i;
//            }
//
//            if(length > maxLength) {
//                maxLength = length;
//                bestStart = startIndex;
//            }
//        }
//
//        for (int i = bestStart; i < bestStart + maxLength; i++) {
//            System.out.print(array[i] + " ");
//        }



    }
}

// if(((currentNumber == lastNumber ) || (currentNumber ==arr[0]))) {
//                counter++;
//            }else {
//                counter = 0;
//            }
//             lastNumber = currentNumber;
//            if(counter > check){
//                check = counter;
//                index = i;
//            }
