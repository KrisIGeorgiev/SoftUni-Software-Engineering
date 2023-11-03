package Methods;

import java.util.Scanner;

public class RepeatString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input =  scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        System.out.println(concatenate(input , quantity));



    }
    public static String concatenate (String input , int quantity) {
          String[] words = new String[quantity];

        for (int i = 0; i < quantity; i++) {
            words[i] = input;
        }
        return String.join("", words);
    }
}
