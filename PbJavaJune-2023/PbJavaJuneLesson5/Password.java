package PbJavaJuneLesson5;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String username =  scanner.nextLine();
        String pass =  scanner.nextLine();
        String input;

        while (true) {
            input =  scanner.nextLine();
            if(input.equals(pass)){
                System.out.printf("Welcome %s!%n" , username);
                break;
            }


        }
    }
        }
