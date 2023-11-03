package Arrays;

import java.util.Scanner;

public class ZigZagArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] firstArr = new int[n];
        int[] secondArr = new int[n];

        for (int rows = 1; rows <= n ; rows++) {
            String input = scanner.nextLine();
            int firstNum = Integer.parseInt(input.split(" ")[0]);
            int secondNum = Integer.parseInt(input.split(" ")[1]);

            if(rows % 2 == 0) {
                firstArr[rows - 1] = firstNum;
                secondArr[rows - 1] = secondNum;
        }else {
                firstArr[rows - 1] = secondNum;
                secondArr[rows - 1] = firstNum;
            }


        }
       for (int array : secondArr) {
           System.out.print(array + " ");
       }
        System.out.println();
       for (int array : firstArr) {
            System.out.print(array + " ");
        }


    }
}
