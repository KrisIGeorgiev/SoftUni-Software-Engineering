package FirstStepsInJava;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //1.	Необходимо количество найлон (в кв.м.) - цяло число в интервала [1... 100]
        //2.	Необходимо количество боя (в литри) - цяло число в интервала [1…100]
        //3.	Количество разредител (в литри) - цяло число в интервала [1…30]
        //4.	Часовете, за които майсторите ще свършат работата - цяло число в интервала [1…9]
         int naylon = Integer.parseInt(scanner.nextLine());
         int paint = Integer.parseInt(scanner.nextLine());
         int razreditel = Integer.parseInt(scanner.nextLine());
         int hours = Integer.parseInt(scanner.nextLine());

         double priceMaterials = (naylon + 2 ) * 1.50 + (paint + 0.10 * paint ) * 14.5 + razreditel * 5.00 + 0.40;

         double priceWorkers = (priceMaterials * 0.3) * hours;

        System.out.println(priceMaterials + priceWorkers);
    }
}
