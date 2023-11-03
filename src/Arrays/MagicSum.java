package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class MagicSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] arr = Arrays.stream
                (scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length - 1; i++) {
            int currentNumber = arr[i];
            for (int j = i + 1; j <= arr.length - 1; j++) {
                if (currentNumber + arr[j] == n) {
                    System.out.printf("%d %d%n", currentNumber , arr[j]);
                }
            }
        }



    }
}
