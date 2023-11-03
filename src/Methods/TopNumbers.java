package Methods;

import java.util.Scanner;

public class TopNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            if(isValid(i)) {
                System.out.println(i);
            }

        }


    }
    public static boolean isValid ( int i) {
        int sum = 0;
        int counter = 0;
        boolean isValid = false;
       while (i > 0) {
           int currentDigit = i % 10;
           sum += currentDigit;
           if(currentDigit % 2 == 1) {
               counter++;
           }
           i /= 10;
       }
        if(sum % 8 == 0 && counter >= 1) {
            isValid = true;
        }
        return isValid;
    }
}
