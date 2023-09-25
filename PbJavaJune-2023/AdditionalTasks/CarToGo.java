package AdditionalTasks;

import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season =  scanner.nextLine();
        String clas = "";
        String car = "";
        double tax = 0;

        if(budget <= 100) {
            clas = "Economy class";
            if(season.equals("Summer")){
                car = "Cabrio";
                tax = 0.35 * budget;
            }else if(season.equals("Winter")){
                car = "Jeep";
                tax = 0.65 * budget;
            }
        }else if(budget > 100 && budget <= 500) {
            clas = "Compact class";
            if(season.equals("Summer")){
                car = "Cabrio";
                tax = 0.45 * budget;
            }else if(season.equals("Winter")){
                car = "Jeep";
                tax = 0.8 * budget;
            }
        }else if(budget > 500) {
            clas = "Luxury class";
            car = "Jeep";
            tax = 0.9 * budget;
        }

        System.out.println(clas);
        System.out.printf("%s - %.2f", car , tax);


    }
}
