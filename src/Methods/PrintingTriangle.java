package Methods;

import java.util.Scanner;

public class PrintingTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        printTriangles1(n);
        printTriangles2(n);





    }
    public static void printTriangles1(int n ) {
        for (int rows = 1; rows <= n; rows++) {
            for (int i = 1; i <= rows; ) {
                System.out.print(i + " ");
                i++;
            }
            System.out.println();

            }


        }
        public static void printTriangles2 (int n) {
            for (int rows = n - 1 ; rows >= 0;) {
                for (int i = 1; i <= rows; ) {
                    System.out.print(i + " ");
                    i++;
                }
                System.out.println();
                rows--;

            }
        }
    }

