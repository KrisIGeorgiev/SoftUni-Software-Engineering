package DataTypesAndVariables;

import java.util.Scanner;

public class PokeMon {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int y = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int realN = n;

        while (!(n < m)) {
            if(n == realN / 2 ) {
                n = n / y;
                if(m > n) {
                    break;
                }
            }
            n-= m;
            counter++;
        }
        System.out.println(n);
        System.out.println(counter);

    }
}
