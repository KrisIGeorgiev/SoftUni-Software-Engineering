package PbRecap;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username =  scanner.nextLine();
        String password = "";
        String input =  scanner.nextLine();
        int counter = 0;

        for (int position = username.length() - 1; position >= 0  ; position--) {
            char currentSymbol = username.charAt(position);
            password += currentSymbol;
            
        }
        while (!input.equals(password)) {
            counter++;
            if(counter == 4){
                System.out.printf("User %s blocked!", username);
                return;
            }
            System.out.println("Incorrect password. Try again.");


            input =  scanner.nextLine();
        }
        System.out.printf("User %s logged in.", username);

    }
}
