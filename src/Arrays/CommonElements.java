package Arrays;

import java.util.Scanner;

public class CommonElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] arrayFirst = scanner.nextLine().split(" ");
        String[] arraySecond = scanner.nextLine().split(" ");



        for (String secondElement : arraySecond) {

            for (String firstElement : arrayFirst) {
                if(secondElement.equals(firstElement)) {
                    System.out.print(secondElement + " ");
                    break;
                }
            }

        }



    }
}
