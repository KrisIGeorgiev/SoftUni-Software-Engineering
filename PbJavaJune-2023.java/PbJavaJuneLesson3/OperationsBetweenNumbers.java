package PbJavaJuneLesson3;

import javax.swing.text.AttributeSet;
import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = Integer.parseInt(scanner.nextLine());
        int n2 = Integer.parseInt(scanner.nextLine());
        char function = scanner.nextLine().charAt(0);
        String eOO = "ni";

        switch (function){
            case'+':
                double result = n1 + n2;
                if(result % 2 == 0) {
                    eOO = "even";
                }else{
                    eOO = "odd";
                }

                System.out.printf("%d %c %d = %.0f - %s" , n1 , function , n2 , result , eOO);
                break;
            case'-':
                double result1 = n1 - n2;
                if(result1 % 2 == 0) {
                    eOO = "even";
                }else{
                    eOO = "odd";
                }

                System.out.printf("%d %c %d = %.0f - %s" , n1 , function , n2 , result1 , eOO);

                break;
            case'*':
                double result2 = n1 * n2;
                if(result2 % 2 == 0) {
                    eOO = "even";
                }else{
                    eOO = "odd";
                }

                System.out.printf("%d %c %d = %.0f - %s" , n1 , function , n2 , result2 , eOO);
                break;
            case'/':


                if (n2 == 0) {

                    System.out.printf("Cannot divide %d by zero", n1);
                }else{
                    double result3 = n1 * 1.0 / n2;
                    System.out.printf("%d / %d = %.2f" , n1 , n2, result3);
                }



                break;
            case'%':

                if (n2 == 0) {

                    System.out.printf("Cannot divide %d by zero" , n1);
                }else {
                    int result4 = n1 % n2;
                    System.out.printf("%d %% %d = %d" , n1 , n2 , result4);
                }



        }

    }
}
