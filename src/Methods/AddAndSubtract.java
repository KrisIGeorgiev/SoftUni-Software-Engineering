package Methods;

import java.util.Scanner;

public class AddAndSubtract {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = Integer.parseInt(scanner.nextLine());
        int second = Integer.parseInt(scanner.nextLine());
        int third = Integer.parseInt(scanner.nextLine());
        System.out.println(sum1and2(first,second) - third);


    }
    public static int sum1and2 (int first , int second) {
        int sum = first + second;
        return sum;
    }
}
