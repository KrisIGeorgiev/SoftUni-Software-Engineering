package Arrays;
import java.util.Arrays;
import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = Arrays.stream( scanner.nextLine().split(" "))
                .mapToInt(e->Integer.parseInt(e))
                .toArray();

        int sumEven = 0;
        int sumOdd = 0;

        for ( int index = 0; index <= numbers.length - 1; index++) {

            if(numbers[index] % 2 == 0) {
                sumEven += numbers[index];
            }else{
                sumOdd += numbers[index];
            }
        }
        System.out.println(sumEven - sumOdd);



    }
}
