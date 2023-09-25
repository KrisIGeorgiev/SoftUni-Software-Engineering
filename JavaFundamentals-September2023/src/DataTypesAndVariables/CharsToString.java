package DataTypesAndVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second = scanner.nextLine().charAt(0);
        char third = scanner.next().charAt(0);

        String combination = String.valueOf(first) + String.valueOf(second) + String.valueOf(third);
        System.out.println(combination);



    }
}
