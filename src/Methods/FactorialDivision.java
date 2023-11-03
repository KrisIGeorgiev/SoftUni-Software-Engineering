package Methods;

import java.util.Scanner;

public class FactorialDivision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        double factFirst = 1;
        double factSecond = 1;

        for (int i = 1; i <= first; i++) {
             factFirst *= i;
        }
        for (int i = 1; i <= second ; i++) {
            factSecond *= i;
        }
        factDivision(factFirst , factSecond);


    }
    public static void factDivision (double factFirst , double factSecond) {
        double sum = factFirst / factSecond;
        System.out.printf("%.2f", sum);

    }
}
