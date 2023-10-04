package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EqualArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[] firstSeq = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        int[] secondSeq = Arrays
                .stream(scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        boolean checker  = false;
        int sum = 0;
        int indexError = 0;
        if(firstSeq.length == secondSeq.length) {

            for (int index = 0; index < firstSeq.length; index++) {
                checker = false;
                if(firstSeq[index] == secondSeq[index] ) {
                    checker = true;
                    sum += firstSeq[index];
                }else {
                    indexError = index;
                    break;
                }

            }
            if(checker){
                System.out.printf("Arrays are identical. Sum: %d", sum);
            }else {
                System.out.printf("Arrays are not identical. Found difference at %d index.", indexError);
            }
        }




    }
}
