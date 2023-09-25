package DataTypesAndVariables;

import java.util.Scanner;


public class RefactorSpecialNumbers {

    public static String capitalizeBoolean(boolean value) {
        return value ? "True": "False";
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countNumbers = Integer.parseInt(scanner.nextLine());
        boolean isSpecialNum = false;
        int sum = 0;


        for (int ch = 1; ch <= countNumbers; ch++) {
           int  currentNumber = ch;
            while (ch > 0) {
               sum += ch % 10;
                ch = ch / 10;
            }
            isSpecialNum = (sum == 5) || (sum == 7) || (sum == 11);

            System.out.printf("%d -> %b%n", currentNumber,capitalizeBoolean(isSpecialNum));
            sum = 0;
            ch = currentNumber;
        }



    }

}
