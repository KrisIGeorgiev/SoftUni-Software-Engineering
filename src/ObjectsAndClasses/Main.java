package ObjectsAndClasses;

import java.awt.color.ICC_ColorSpace;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Vehicle> catalogue = new ArrayList<>();
        double powerCars = 0;
        double powerTrucks = 0;
        int countCars = 0;
        int countTrucks = 0;
       while (true) {
           String input =  scanner.nextLine();
           if (input.equals("End")) {
               break;
           }
           String[] arr = input.split(" ");
           String typeVehicle = arr[0];
           String model = arr[1];
           String color = arr[2];
           int horsePower = Integer.parseInt(arr[3]);
           Vehicle vehicles = new Vehicle(typeVehicle, model , color, horsePower);

           catalogue.add(vehicles);
       }
       while (true) {
           String sm =  scanner.nextLine();
           if(sm.equals("Close the Catalogue")) {
               break;
           }
           for (Vehicle vehicle : catalogue) {
               if(vehicle.getModel().equals(sm)) {
                   System.out.println(vehicle.toString());

               }

           }
       }
       for(Vehicle vehicle : catalogue) {
           if(vehicle.getTypeVehicle().equals("car")){
               powerCars += vehicle.getHorsePower();
               countCars++;
           }else {
               powerTrucks += vehicle.getHorsePower();
               countTrucks++;
           }

       }
        if(powerTrucks <= 0 || countTrucks <= 0 ) {
            System.out.printf("Cars have average horsepower of: %.2f.%n", powerCars / countCars);
            System.out.println("Trucks have average horsepower of: 0.00.");
            return;
        }if(powerCars <=  0 || countCars <= 0) {
            System.out.println("Cars have average horsepower of: 0.00.");
            System.out.printf("Trucks have average horsepower of: %.2f.", powerTrucks / countTrucks);
            return;

        }

        System.out.printf("Cars have average horsepower of: %.2f.%n", powerCars / countCars);
        System.out.printf("Trucks have average horsepower of: %.2f.", powerTrucks / countTrucks);






    }
}

