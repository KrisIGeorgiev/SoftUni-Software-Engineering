package AdditionalTasks;

import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double end = 0;


        while(true){
            double a = Double.parseDouble(scanner.nextLine());
            if(a < 0) {
                System.out.println("Negative number!");
                break;
            }
            end = a * 2;
            System.out.printf("Result: %.2f%n", end);

        }
    }
}
