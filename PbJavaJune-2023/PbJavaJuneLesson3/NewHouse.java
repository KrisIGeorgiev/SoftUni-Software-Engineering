package PbJavaJuneLesson3;

import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

//Ако Нели купи повече от 80 Рози - 10% отстъпка от крайната цена
//
//· Ако Нели купи повече от 90 Далии - 15% отстъпка от крайната цена
//
//· Ако Нели купи повече от 80 Лалета - 15% отстъпка от крайната цена
//
//· Ако Нели купи по-малко от 120 Нарциса - цената се оскъпява с 15%
//
//· Ако Нели Купи по-малко от 80 Гладиоли - цената се оскъпява с 20%
        String flower =  scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());
        double percent = 0;
        double cena = 0;


        if(flower.equals("Roses")) {
            if (quantity > 80) {
                percent = 0.1;
            }
            cena = quantity * 5 - (percent *(quantity * 5));


        }else if(flower.equals("Dahlias")) {
            if (quantity > 90) {
                percent = 0.15;
            }
            cena = quantity * 3.80 - (percent *(quantity * 3.80));


        }else if(flower.equals("Tulips")) {
            if(quantity > 80) {
                percent = 0.15;
            }
            cena = quantity * 2.80 - (percent *(quantity * 2.80));

        }else if(flower.equals("Narcissus")) {
            if(quantity < 120) {
                percent = 0.15;
            }
            cena = quantity * 3 + (percent *(quantity * 3));

        }else if(flower.equals("Gladiolus")) {
            if (quantity < 80) {
                percent = 0.2;
            }
            cena = quantity * 2.5 + (percent *(quantity * 2.5));

        }
        if(cena <= budget) {
            double rest = Math.abs(budget - cena);
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left." , quantity , flower , rest);
        }else {
            double rest = Math.abs(budget - cena);
            System.out.printf("Not enough money, you need %.2f leva more." , rest);
        }

    }
}
