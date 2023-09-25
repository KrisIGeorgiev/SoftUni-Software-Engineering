package DataTypesAndVariables;

import java.util.Scanner;

public class BeerKegs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String winner = "";
        double previousVolume = 0;


        for (int i = 0; i < n; i++) {
            String model =  scanner.nextLine();
            double radius = Double.parseDouble(scanner.nextLine());
            int height = Integer.parseInt(scanner.nextLine());
            double volume = Math.PI * height * Math.pow(radius , 2);
            if(volume >= previousVolume ) {
                winner = model;
                previousVolume = volume;
            }




        }
        System.out.println(winner);




    }
}
