package Methods;


import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Scanner;

public class MathPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = Double.parseDouble(scanner.nextLine());
        int power = Integer.parseInt(scanner.nextLine());
        System.out.println(new DecimalFormat("0.####"). format(mathPowerGet(n , power)));



    }

    public static double mathPowerGet(double n , int power) {
         double result =  Math.pow(n , power);
         return result;

    }
}
