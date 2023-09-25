package PbJavaJuneLesson6;

import java.util.Scanner;

public class SpecialNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int counterGood = 0;

        for(int i = 1111 ; i <= 9999; i++) {
            String text = String.valueOf(i);
            for (int position = 0; position < text.length();position++) {
                int wholeNumber = Integer.parseInt(String.valueOf(text.charAt(position)));
                if(wholeNumber == 0) {
                    continue;
                }
                if(n % wholeNumber == 0 ) {
                    counterGood++;
                }


            }
            if(counterGood == text.length()) {
                System.out.print(i + " ");
                counterGood = 0;
            }else{
                counterGood = 0;
            }
        }
    }
}
