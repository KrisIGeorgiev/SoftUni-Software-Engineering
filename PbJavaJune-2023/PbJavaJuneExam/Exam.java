package PbJavaJuneExam;

import java.util.Scanner;

public class Exam {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //На първия ред – броя на студентите явили се на изпит – цяло число в интервала [1...1000]
        // За всеки един студент на отделен ред – оценката от изпита – реално число в интервала [2.00...6.00]
        int students = Integer.parseInt(scanner.nextLine());
        double average = 0;
        int counter4 = 0;
        int counter3 = 0;
        int counter2 = 0;
        int counter1 = 0;

        for (int i = 0; i < students; i++) {
            double grade = Double.parseDouble(scanner.nextLine());
             average += grade;
             if(grade < 3) {
                 counter4++;
             }else if(grade >= 3 && grade <= 3.99) {
                 counter3++;
             }else if(grade >= 4 && grade <= 4.99) {
                 counter2++;
             }else if(grade >= 5) {
                 counter1++;
             }
        }

        double group1 = counter1  * 1.0 / students * 100;
        double group2 = counter2  * 1.0 / students * 100;
        double group3 = counter3  * 1.0 / students * 100;
        double group4 = counter4  * 1.0 / students * 100;
        double Average = average / students;

        System.out.printf("Top students: %.2f%%%n", group1);
        System.out.printf("Between 4.00 and 4.99: %.2f%%%n", group2);
        System.out.printf("Between 3.00 and 3.99: %.2f%%%n", group3);
        System.out.printf("Fail: %.2f%%%n", group4);
        System.out.printf("Average: %.2f%n", Average);

    }
}
