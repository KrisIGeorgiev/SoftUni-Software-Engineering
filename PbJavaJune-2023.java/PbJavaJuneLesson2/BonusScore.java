package PbJavaJuneLesson2;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Ако числото е до 100 включително, бонус точките са 5.
        //
        //· Ако числото е по-голямо от 100, бонус точките са 20% от числото.
        //
        //· Ако числото е по-голямо от 1000, бонус точките са 10% от числото.
        //
        //· Допълнителни бонус точки (начисляват се отделно от предходните):
        //
        //o За четно число à + 1 т.
        //
        //o За число, което завършва на 5 à + 2 т.

        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;

        if(num <= 100) {
            bonus = 5;
            if(num % 2 == 0) {
                bonus =  bonus + 1;
            }   if(num % 10 == 5) {
                bonus = bonus + 2;
            }
        } else if(num > 100 && num <= 1000) {
            bonus  = 0.2 * num;
            if(num % 2 == 0) {
                bonus =  bonus + 1;
            }   if(num % 10 == 5) {
                bonus = bonus + 2;
            }
        } else if (num > 1000) {
            bonus = 0.1 * num;
            if(num % 2 == 0) {
                bonus =  bonus + 1;
            }   if(num % 10 == 5) {
                bonus = bonus + 2;
            }

        }
        System.out.println(bonus);
        System.out.println(bonus + num);
    }
}
