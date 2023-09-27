package DataTypesAndVariables;

import java.util.Objects;
import java.util.Scanner;

public class DataTypeFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input =  scanner.nextLine();

       String dataType = null;
        while (!input.equals("END")){


            if (input.matches("\\d+")) {
                System.out.println(input + " is integer type");
            } else if (input.matches("\"\\\\d*[.]\\\\d+\"")) {
                System.out.println(input + " is floating point type");
            } else if (input.matches(".")) {
                System.out.println(input + " is character type");
            } else if (input.equals("true") || input.equals("false")) {
                System.out.println(input + " is boolean type");
            } else {
                System.out.println(input + " is string type");
            }
            input =  scanner.nextLine();
        }

    }
}
