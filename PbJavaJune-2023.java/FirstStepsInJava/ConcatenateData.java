package FirstStepsInJava;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //"You are <firstName> <lastName>, a <age>-years old person from <town>."

        String name = scanner.nextLine();
        String lastname = scanner.nextLine();
        int age = Integer.parseInt(scanner.nextLine());
        String town = scanner.nextLine();


        System.out.println("You are " + name + " " + lastname +", a " + age + "-years old person from " +town + ".");
    }
}
