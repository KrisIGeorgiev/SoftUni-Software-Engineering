package PbJavaJuneLesson3;

import java.util.Scanner;

public class InvalidNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//Дадено число е валидно, ако е в диапазона [100…200] или е 0
        int num =   Integer.parseInt(scanner.nextLine());

        if(!(num >= 100 && num <= 200 || num == 0)) {
            System.out.println("invalid");
        }
    }
}
