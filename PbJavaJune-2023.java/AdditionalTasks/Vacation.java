package AdditionalTasks;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season =  scanner.nextLine();
        String accomoddation = "";
        String direction = "";
        double price = 0;


        if(budget <= 1000) {
            accomoddation = "Camp";
            if(season.equals("Summer")) {
                direction = "Alaska";
                price = 0.65 * budget;
            }else if(season.equals("Winter")) {
                direction = "Morocco";
                price = 0.45 * budget;
            }
        }else if(budget >= 1000 && budget <= 3000) {
            accomoddation = "Hut";
            if(season.equals("Summer")) {
                direction = "Alaska";
                price = 0.80 * budget;
            }else if(season.equals("Winter")) {
                direction = "Morocco";
                price = 0.60 * budget;
            }

        }else if(budget > 3000) {
            accomoddation = "Hotel";
            if(season.equals("Summer")) {
                direction = "Alaska";
                price = 0.9 * budget;
            }else if(season.equals("Winter")) {
                direction = "Morocco";
                price = 0.9 * budget;
            }
        }
        System.out.printf("%s - %s - %.2f" , direction , accomoddation , price);
    }
}
