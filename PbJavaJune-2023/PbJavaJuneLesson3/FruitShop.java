package PbJavaJuneLesson3;

import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//2.70 1.25 0.90 1.60 3.00 5.60 4.20
        String product =  scanner.nextLine();
        String day =  scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());
        double price = 0;
        String error = "bull";

        if((day.equals("Sunday") || day.equals("Saturday"))) {
            if(product.equals("banana")) {

                price = 2.70;
            }
            if(product.equals("apple")) {

                price = 1.25;
            }
            if (product.equals("orange")) {

                price = 0.90;
            }
            if(product.equals("grapefruit")) {

                price = 1.60;
            }
            if(product.equals("kiwi")) {

                price = 3.00;
            }
            if(product.equals("pineapple")) {

                price = 5.60;
            }
            if(product.equals("grapes")) {

                price = 4.20;

            } else if(!(product.equals("banana") || product.equals("kiwi") || product.equals("grapefruit") || product.equals("apple") || product.equals("orange") || product.equals("pineapple") || product.equals("grapes")) ) {
                    error =  "error";
                }
        }else if(day.equals("Monday") || day.equals("Tuesday") || day.equals("Wednesday") || day.equals("Thursday") || day.equals("Friday")) {

                if(product.equals("banana")) {

                price = 2.50;
            }
                if(product.equals("apple")) {

                    price = 1.20;
                }                                                     //2.50 1.20 0.85 1.45 2.70 5.50 3.85
                if (product.equals("orange")) {

                    price = 0.85;
                }
                if(product.equals("grapefruit")) {

                    price = 1.45;
                }
                if(product.equals("kiwi")) {

                    price = 2.70;
                }
                if(product.equals("pineapple")) {

                    price = 5.50;
                }
                if(product.equals("grapes")) {

                    price = 3.85;

            } else if(!(product.equals("banana") || product.equals("kiwi") || product.equals("grapefruit") || product.equals("apple") || product.equals("orange") || product.equals("pineapple") || product.equals("grapes")) ) {
                    error = "error";
                }

        }
        if(!(day.equals("Monday") || day.equals("Tuesday")  || day.equals("Wednesday")  || day.equals("Thursday")  || day.equals("Friday" )|| day.equals("Saturday") || day.equals("Sunday")) ) {
    error = "error";
        }
        if(error.equals("error")){
            System.out.println("error");


        }else {
            System.out.printf("%.2f" , price * quantity);
        }

    }
}
