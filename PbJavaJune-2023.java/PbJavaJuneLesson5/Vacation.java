package PbJavaJuneLesson5;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // •	Пари нужни за екскурзията - реално число в интервала [1.00…25000.00]
        //•	Налични пари - реално число в интервала [0.00...25000.00]
        //След това многократно се четат по два реда:
        //•	Вид действие - текст с възможности "spend" и "save"
        //•	Сумата, която ще спести/похарчи - реално число в интервала [0.01…25000.00]

        double neededMoney = Double.parseDouble(scanner.nextLine());
        double nowMoney = Double.parseDouble(scanner.nextLine());
        int spendingCounter = 0;
        int days = 0;


        while (true) {
            String action =  scanner.nextLine();
            double sum = Double.parseDouble(scanner.nextLine());
            days++;
            if(action.equals("save")) {
                nowMoney += sum;
                spendingCounter = 0;
            }
            else if(action.equals("spend")) {
                nowMoney -= sum;
                spendingCounter++;
                if(nowMoney < 0) {
                    nowMoney = 0;
                }

            }if(spendingCounter == 5) {
                System.out.println("You can't save the money.");
                System.out.println(days);
                break;
            }if(nowMoney >= neededMoney) {
                System.out.printf("You saved the money for %d days." , days);
                break;
            }
        }
    }
}
