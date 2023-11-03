package Methods;

import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        input = input.toLowerCase();
        int counter = 0;
        int counterWords = 0;
        System.out.println(getVowels(input , counter ));



    }
    public static int getVowels(String input, int counter ) {

        for (int i = 0; i <= input.length() - 1  ; i++) {


            char currentLetter = input.charAt(i);
            if(currentLetter == 'a'  || currentLetter == 'e'
                    || currentLetter == 'i' || currentLetter == 'o'||
            currentLetter == 'u') {
                 counter++;

            }
        }
        return counter;
    }
}
