package Methods;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MathOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double first = Double.parseDouble(scanner.nextLine());
        char operator = scanner.nextLine().charAt(0);
        double second = Double.parseDouble(scanner.nextLine());


      if(operator == '+') {
          System.out.println(new DecimalFormat("0.##") .format(add(first, second)));

      }else if(operator == '-') {
          System.out.println(new DecimalFormat("0.##") .format(subtract(first, second)));


      }else if (operator == '/'){
          System.out.println(new DecimalFormat("0.##") .format(divide(first, second)));

      }else {
          System.out.println(new DecimalFormat("0.##") .format(multiply(first, second)));
      }


    }
    public static double add (double first  , double second) {
        double result = first + second;
        return result;
    }
    public static double subtract (double first , double second) {
        double result = first - second;
        return result;
    }
    public static double divide(double first , double second) {
        double result = first / second;
        return result;
    }
    public static double multiply (double first , double second) {
        double result = first * second;
        return result;
    }
}
