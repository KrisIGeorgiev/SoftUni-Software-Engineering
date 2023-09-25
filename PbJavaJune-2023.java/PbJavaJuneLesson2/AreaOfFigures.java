package PbJavaJuneLesson2;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String figure =  scanner.nextLine();

        //Ако фигурата е квадрат (square): на следващия ред се чете едно дробно число - дължина на страната му
        //
        //· Ако фигурата е правоъгълник (rectangle): на следващите два реда четат две дробни числа - дължините на страните му
        //
        //· Ако фигурата е кръг (circle): на следващия ред чете едно дробно число - радиусът на кръга
        //
        //· Ако фигурата е триъгълник (triangle): на следващите два реда четат две дробни числа - дължината на страната му и дължината на височината към нея
        //
        //Резултатът да се закръгли до 3 цифри след десетичната запетая.

        if(figure.equals("square")) {
            double a = Double.parseDouble(scanner.nextLine());
            double area = a * a;
            System.out.printf("%.3f" , area);

        }else if(figure.equals("rectangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = a * b;
            System.out.printf("%.3f" , area);
        }else if(figure.equals("circle")) {
            double radius = Double.parseDouble(scanner.nextLine());
            double area = Math.PI * radius * radius;
            System.out.printf("%.3f" , area);
        } else if (figure.equals("triangle")) {
            double a = Double.parseDouble(scanner.nextLine());
            double b = Double.parseDouble(scanner.nextLine());
            double area = (a * b) / 2;
            System.out.printf("%.3f" , area);

        }
    }
}
