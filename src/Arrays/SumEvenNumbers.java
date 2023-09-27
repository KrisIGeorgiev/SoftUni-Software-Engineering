package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SumEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int sumEven = 0;

        for (int index = 0; index < numbers.length; index++) {

            if(numbers[index] % 2 == 0) {
                sumEven += numbers[index];
            }

        }
        System.out.println(sumEven);





    }
}
