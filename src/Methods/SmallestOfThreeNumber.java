package Methods;

import java.util.Scanner;

public class SmallestOfThreeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstN = Integer.parseInt(scanner.nextLine());
        int secondN = Integer.parseInt(scanner.nextLine());
        int thirdN = Integer.parseInt(scanner.nextLine());

        System.out.println(getSmallest(firstN , secondN , thirdN));



    }
    public static int getSmallest(int firstN , int secondN , int thirdN) {
        int smallest = Integer.MAX_VALUE;
        if(firstN < smallest) {
             smallest = firstN;
            if(secondN < firstN) {
                smallest = secondN;
            }if(thirdN < smallest) {
                smallest = thirdN;
            }
        }
        return smallest;
    }
}
