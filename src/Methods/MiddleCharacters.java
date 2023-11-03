package Methods;

import java.util.Scanner;

public class MiddleCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text =  scanner.nextLine();
        // 7 / 2 = 3 mama
        getMiddleCharacters(text);

    }
    public static void getMiddleCharacters (String text) {
        char middleChar;
        if(text.length() % 2 == 0) {
            int position = text.length() / 2;
            char middleCharEven = text.charAt(position - 1);
            char middleCharEven2 = text.charAt(position);
            System.out.print(middleCharEven);
            System.out.print(middleCharEven2);

        }else {
            int position = text.length() / 2 ;
            middleChar = text.charAt(position);
            System.out.println(middleChar);
        }

    }
}
