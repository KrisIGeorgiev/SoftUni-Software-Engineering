package Methods;

import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentNum = 0;
        while (true) {
            String input =  scanner.nextLine();
            if(input.equals("END")) {
                return;
            }
            currentNum = Integer.parseInt(input);
            if(isPalindrome(currentNum)) {
                System.out.println("true");
            }else {
                System.out.println("false");
            }

        }



    }
    public static boolean isPalindrome (int currentNum) {
        int real = currentNum;
        boolean isPalindrome = false;
        String palindrome = "";
        int i = 0;
        while (currentNum > 0) {
            int lastDigit = currentNum % 10;
             palindrome += lastDigit;
             currentNum /= 10;
        }

        if(String.valueOf(real).equals(palindrome)) {
            isPalindrome = true;
        }
       return isPalindrome;
    }
}
