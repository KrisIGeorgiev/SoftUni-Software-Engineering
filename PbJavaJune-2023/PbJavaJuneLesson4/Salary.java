package PbJavaJuneLesson4;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tabs = Integer.parseInt(scanner.nextLine());
        int salary = Integer.parseInt(scanner.nextLine());
        int tax = 0;
        int number = 0;

        for (int i = 1; i <= tabs; i++) {
            String website = scanner.nextLine();
            number++;
            if (website.equals("Facebook")) {
                tax += 150;
            }
            if (website.equals("Instagram")) {
                tax += 100;
            }
            if (website.equals("Reddit")) {
                tax += 50;
            }
            if (tax >= salary) {
                System.out.println("You have lost your salary.");
                break;


            }else if(number == tabs){
                System.out.println(salary - tax);
                break;
            }

        }

    }
}
