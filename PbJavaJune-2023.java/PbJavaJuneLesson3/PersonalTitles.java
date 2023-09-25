package PbJavaJuneLesson3;

import java.util.Scanner;

public class PersonalTitles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //"Mr." - мъж (пол "m") на 16 или повече години
        //
        //· "Master" - момче (пол "m") под 16 години
        //
        //· "Ms." - жена (пол "f") на 16 или повече години
        //
        //· "Miss" - момиче (пол "f") под 16 години

        double age = Double.parseDouble(scanner.nextLine());
        String name =  scanner.nextLine();
        String gender = "null";
        String a = "null";


        if(name.equals("m")){
            gender = "male";
            if(age >= 16) {
                a = "Mr.";

            } else {
                a = "Master";
            }

        }else if(name.equals("f")){
            gender = "female";

            if(age >= 16) {
                a = "Ms.";

            } else {
                a = "Miss";
            }
        }
        System.out.println(a);
    }
}
