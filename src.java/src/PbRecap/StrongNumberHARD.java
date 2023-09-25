package PbRecap;

import java.util.Scanner;

public class StrongNumberHARD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int nReal = n;
        int lastDigit;
        int sum = 1;
        int sumReal = 0;
        while (n > 0){
            lastDigit = n % 10;
            sum = 1;
            for (int i = 1; i <= lastDigit ; i++) {
                sum *= i;
            }
            sumReal += sum;

            n /= 10;
        }

        if(nReal == sumReal) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }



    }
}
