package PbJavaJuneLesson5;

import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int all = width * length;
        int taken = 0;

        while (true) {
            String input =  scanner.nextLine();
            if(input.equals("STOP")){
                if(taken <  all) {
                    int diff = Math.abs(taken - all);
                    System.out.printf("%d pieces are left." , diff);
                    break;
                }
                else if (all  < taken){
                    int diff  = Math.abs(taken - all);
                    System.out.printf("No more cake left! You need %d pieces more." , diff);
                    break;

                }

            }
            int pieces = Integer.parseInt(input);
             taken += pieces;
             if(taken >= all) {
                 int diff = Math.abs(taken - all);
                 System.out.printf("No more cake left! You need %d pieces more." , diff);
                 break;
             }

        }
    }
}
