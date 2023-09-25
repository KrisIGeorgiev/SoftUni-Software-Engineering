package PbJavaJuneLesson3;

import java.util.Scanner;

public class SummerOutfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grad = Integer.parseInt(scanner.nextLine());
        String time =  scanner.nextLine();
        String clothes = "a";
        String boots = "ab";

        if (time.equals("Morning")){
            if(grad >= 10 && grad <= 18) {
                clothes = "Sweatshirt";
                boots = "Sneakers";
            }else if(grad > 18 && grad <= 24) {
                clothes = "Shirt";
                boots = "Moccasins";
            }else if(grad >= 25) {
                clothes = "T-Shirt";
                boots = "Sandals";

            }

        }else if(time.equals("Afternoon")) {
            if(grad >= 10 && grad <= 18) {
                clothes = "Shirt";
                boots = "Moccasins";
            }else if(grad > 18 && grad <= 24) {
                clothes = "T-Shirt";
                boots = "Sandals";
            }else if(grad >= 25) {
                clothes = "Swim Suit";
                boots = "Barefoot";

            }

        }else if(time.equals("Evening")) {
            if(grad >= 10 && grad <= 18) {
                clothes = "Shirt";
                boots = "Moccasins";
            }else if(grad > 18 && grad <= 24) {
                clothes = "Shirt";
                boots = "Moccasins";
            }else if(grad >= 25) {
                clothes = "Shirt";
                boots = "Moccasins";

            }

        }
        System.out.printf("It's %d degrees, get your %s and %s." , grad , clothes , boots );
    }
}
