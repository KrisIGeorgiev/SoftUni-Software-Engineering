package Methods;

import java.util.Scanner;

public class CharactersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char first = scanner.nextLine().charAt(0);
        char second =  scanner.nextLine().charAt(0);
        for (char current : asciiValue(first , second)) {
            System.out.print(current + " ");
        }




    }
    public static char[] asciiValue (char fist, char second) {
        int ch1 = fist;
        int ch2 = second;
        int n = Math.abs(fist - second) - 1;
        char[] numbers = new char[n];
        int index = 0;

        if(ch1 > ch2) {


            for (int i = ch2 + 1; i < ch1; i++) {
                char current = (char) i;
                numbers[index] = current;
                index++;
            }
        }else {
            for (int i = ch1 + 1; i < ch2; i++) {
                char current = (char) i;
                numbers[index] = current;
                index++;
            }
        }
        return numbers;
    }
}
