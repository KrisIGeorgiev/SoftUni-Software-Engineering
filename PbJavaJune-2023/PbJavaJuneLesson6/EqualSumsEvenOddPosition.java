package PbJavaJuneLesson6;

import java.util.Scanner;

public class EqualSumsEvenOddPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int firstNum = Integer.parseInt(scanner.nextLine());
        int secondNumber = Integer.parseInt(scanner.nextLine());


        for (int currenrNumber = firstNum; currenrNumber <= secondNumber ; currenrNumber++) {
            int sumEven = 0;
            int sumOdd = 0;


            String text = String.valueOf(currenrNumber);
            for (int position = 0; position < text.length()  ; position++) {
                int wholeNumber = Integer.parseInt(String.valueOf(text.charAt(position)));
                if (position % 2 == 0) {
                    sumEven += wholeNumber;
                }else {
                    sumOdd += wholeNumber;
                }


            }
            if(sumEven == sumOdd) {
                System.out.print(currenrNumber + " ");
            }
        }


    }
}
