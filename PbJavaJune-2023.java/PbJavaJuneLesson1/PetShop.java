package PbJavaJuneLesson1;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Напишете програма, която пресмята нужните разходи за закупуването на храна за кучета и котки.
        // Храната се пазарува от зоомагазин, като една опаковка храна за кучета е на цена 2.50 лв,
        // а опаковка храна за котки струва 4 лв.
        int dogs = Integer.parseInt(scanner.nextLine());
        int cats = Integer.parseInt(scanner.nextLine());
        double all = dogs * 2.50 + cats * 4;
        System.out.println(all + " lv.");

    }
}
