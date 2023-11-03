package Methods;

import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	"coffee" – 1.50
        //•	"water" – 1.00
        //•	"coke" – 1.40
        //•	"snacks" – 2.00
        String product =  scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        result(product, quantity);



    }
    public static void result(String product , int quantity) {
        double sum = 0;
        switch (product) {
            case"coffee":
                sum = quantity * 1.50;
                break;
            case"water":
                sum = quantity;
                break;
            case"coke":
                sum = 1.40 * quantity;
                break;
            case"snacks":
                sum = 2 * quantity;
                break;
        }
        System.out.printf("%.2f", sum);
    }
}
