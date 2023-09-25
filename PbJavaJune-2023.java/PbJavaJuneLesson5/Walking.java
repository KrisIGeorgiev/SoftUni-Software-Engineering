package PbJavaJuneLesson5;

import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int goal = 10000;
        int  sum = 0;

        while (true) {
            String input =  scanner.nextLine();
            if(input.equals("Going home")) {
                int home = Integer.parseInt(scanner.nextLine());
                sum += home;
                if(sum >= goal) {
                    int diff = Math.abs(goal-sum);
                    System.out.printf("Goal reached! Good job!%n");
                    System.out.printf("%d steps over the goal!" , diff);
                    break;
            }else {
                    int diff = Math.abs(sum -  goal);
                    System.out.printf("%d more steps to reach goal." , diff);
                    break;
                }
            }
                int steps = Integer.parseInt(input);

             sum += steps;
             if(sum >= goal) {
                 int diff = Math.abs(goal-sum);
                 System.out.printf("Goal reached! Good job!%n");
                 System.out.printf("%d steps over the goal!" , diff);
                 break;
             }
        }
    }
}

