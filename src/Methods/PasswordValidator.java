package Methods;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();


        if(!isLength(password)) {
            System.out.println("Password must be between 6 and 10 characters");
        }
        if(!isLetterOrDigit(password)) {
            System.out.println("Password must consist only of letters and digits");
        }
        if(!isDigits(password)) {
            System.out.println("Password must have at least 2 digits");
        }
        if(isDigits(password) && isLength(password) && isLetterOrDigit(password)) {
            System.out.println("Password is valid");
        }



    }

    public static boolean isLength(String password) {
       boolean isLength = false;
        if (password.length() >= 6 && password.length() <= 10) {
            isLength = true;
        }
        return isLength;

    }
    public static boolean isLetterOrDigit(String password) {
        boolean isLetterOrDigit = true;
        for (char current : password.toCharArray()) {
            if(!Character.isLetterOrDigit(current)) {
                isLetterOrDigit =false;
            }

        }
        return isLetterOrDigit;
    }
    public static boolean isDigits (String password) {
        boolean isDigits = false;
        int counter = 0;
        for (char current : password.toCharArray()) {
            if(Character.isDigit(current)) {
                counter++;
            }
        }
        if(counter >= 2) {
            isDigits = true;
        }
        return isDigits;
    }
}
