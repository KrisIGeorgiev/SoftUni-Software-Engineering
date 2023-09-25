package PbJavaJuneLesson6;

import java.util.Scanner;

public class TrainTheTrainers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int people = Integer.parseInt(scanner.nextLine());
        String input = "";
        double sumPresentation = 0;
        double averagePresentation = 0;
        int grades;
        double sumAll = 0;
        int counter = 0;

outerloop:
        while (!input.equals("Finish")) {
            input =  scanner.nextLine();
            if(input.equals("Finish")) {
                break outerloop;
            }
            counter++;
            sumPresentation = 0;

            for( grades = 0; grades < people; grades++) {
                double grade = Double.parseDouble(scanner.nextLine());
                sumPresentation += grade;


            }
            averagePresentation = sumPresentation / grades;
            sumAll += averagePresentation;
            System.out.printf("%s - %.2f." , input , averagePresentation);
            System.out.println();

        }
        double averageAll = sumAll / counter ;
        System.out.printf("Student's final assessment is %.2f." , averageAll);

    }
}
