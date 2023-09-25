package PbJavaJuneLesson5;

import java.util.Scanner;

public class OldBooks {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name =  scanner.nextLine();
        int counter = 0;


        while (true) {
            String current =  scanner.nextLine();
            if(current.equals("No More Books")) {
                System.out.printf("The book you search is not here!%n");
                System.out.printf("You checked %d books." , counter);
                break;

            } else if (current.equals(name)) {
                System.out.printf("You checked %d books and found it." , counter);
                break;
            }
            counter++;

        }

    }
}
