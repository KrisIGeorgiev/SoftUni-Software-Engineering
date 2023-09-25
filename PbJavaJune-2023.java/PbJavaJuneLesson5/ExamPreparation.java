package PbJavaJuneLesson5;

import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първи ред - брой незадоволителни оценки - цяло число в интервала [1…5]
        //•	След това многократно се четат по два реда:
        //o	Име на задача - текст
        //o	Оценка - цяло число в интервала [2…6]

        int unsatisfied = Integer.parseInt(scanner.nextLine());
        int counter = 0;
        int counterproblems = 0;
        int sum = 0;
        String LastProblem = "";

        while (true){
            String problem =  scanner.nextLine();
            if(!problem.equals("Enough")) {
                LastProblem = problem;
                counterproblems++;


                int grade = Integer.parseInt(scanner.nextLine());
                sum += grade;
                if (grade <= 4) {
                    counter++;
                }
            }
            if(counter ==  unsatisfied) {
                System.out.printf("You need a break, %d poor grades." , counter);
                break;
            }if(problem.equals("Enough")) {
                double average = sum * 1.0 / counterproblems;
                System.out.printf("Average score: %.2f%n" , average);
                System.out.printf("Number of problems: %d%n" , counterproblems);
                System.out.printf("Last problem: %s" , LastProblem);
                break;
            }
        }
    }
}
