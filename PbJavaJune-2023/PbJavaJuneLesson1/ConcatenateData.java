package PbJavaJuneLesson1;

import java.util.Scanner;

public class ConcatenateData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която прочита от конзолата име, фамилия, възраст и град и печата следното съобщение:
        // "You are <firstName> <lastName>, a <age>-years old person from <town>."

        String name =  scanner.nextLine();
        String family =  scanner.nextLine();
        int age  = Integer.parseInt(scanner.nextLine());
        String town =  scanner.nextLine();
        System.out.println("You are " + name + " " + family +  ", a " + age +  "-years old person from " + town + ".");
    }
}
