package ObjectsAndClasses;

import java.math.BigInteger;
import java.util.Scanner;

public class BigFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
    int  a = Integer.parseInt(scanner.nextLine());
        BigInteger result =  BigInteger.valueOf(1);

        for (int i = 1; i <= a; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        System.out.println(result);

    }
}
