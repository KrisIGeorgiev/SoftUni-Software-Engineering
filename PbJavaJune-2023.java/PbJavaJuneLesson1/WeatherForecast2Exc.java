package PbJavaJuneLesson1;

import java.util.Scanner;

public class WeatherForecast2Exc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //26.00 - 35.00	Hot
        //20.1 - 25.9	Warm
        //15.00 - 20.00	Mild
        //12.00 - 14.9	Cool
        //5.00 - 11.9	Cold

        double degrees = Double.parseDouble(scanner.nextLine());

        if(degrees >= 26 && degrees <= 35 ) {
            System.out.println("Hot");

        } else if (degrees >= 20.1 && degrees <= 25.9) {
            System.out.println("Warm");

        }else if(degrees >= 15 && degrees <= 20){
            System.out.println("Mild");
        }else if(degrees >= 12 && degrees <= 14.9){
            System.out.println("Cool");
        }else if (degrees >= 5 && degrees <= 11.9){
            System.out.println("Cold");
        }else {
            System.out.println("unknown");
        }
    }
}
