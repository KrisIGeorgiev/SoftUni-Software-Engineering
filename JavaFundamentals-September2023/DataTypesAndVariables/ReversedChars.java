package DataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.nextLine().charAt(0);

        String combination = String.valueOf(third) + " " + String.valueOf(second) + " " + String.valueOf(first) + " ";
        System.out.println(combination);


    }
}
