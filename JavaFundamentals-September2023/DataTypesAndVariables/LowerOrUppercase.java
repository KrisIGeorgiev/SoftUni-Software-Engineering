package DataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUppercase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char character = scanner.nextLine().charAt(0);

        if(Character.isUpperCase(character)){
            System.out.println("upper-case");
        }else {
            System.out.println("lower-case");
        }
    }
}
