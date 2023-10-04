package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CondenseArrayToNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numbers = Arrays.stream
                (scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        if(numbers.length > 1) {
            int[] condensed = new int[numbers.length - 1];


            for (int i = 0; i <= numbers.length - 1; i++) {


                      for (int index = 0; index < numbers.length - 1; index++) {
                          condensed[index] = numbers[index] + numbers[index + 1];


                      }
                      numbers = condensed;
                  }


            System.out.println(condensed[0]);


        }else {
            System.out.println(numbers[0]);
        }



    }
}
