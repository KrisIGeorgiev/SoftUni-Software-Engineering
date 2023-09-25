package PbJavaJuneLesson5;

import java.util.Scanner;

public class Graduation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name =  scanner.nextLine();
        double grade;
        double sum = 0;
        int gradeNum = 0;


        int counterExc = 0;
        while (counterExc < 2) {
            grade = Double.parseDouble(scanner.nextLine());
            gradeNum++;
            if(grade < 4) {
                counterExc++;
            }if(counterExc == 2) {
                System.out.printf("%s has been excluded at %d grade"  , name , gradeNum - 1 );
                break;
            }
            sum += grade;
            if(gradeNum == 12) {
                double average = sum / gradeNum;
                System.out.printf("%s graduated. Average grade: %.2f" , name , average);
                break;
            }

        }
    }
}
