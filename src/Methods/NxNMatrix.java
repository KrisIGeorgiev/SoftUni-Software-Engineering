package Methods;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        getMatrix(n);

    }
    public static void  getMatrix (int n) {
        for (int rows = 1; rows <= n ; rows++) {
            for (int numbers = 1; numbers <= n ; numbers++) {
                System.out.print(n + " ");
            }
            System.out.println();
        }
    }
}
