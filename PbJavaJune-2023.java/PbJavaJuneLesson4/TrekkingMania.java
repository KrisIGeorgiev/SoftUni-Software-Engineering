package PbJavaJuneLesson4;

import java.util.Scanner;

public class TrekkingMania {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int allPeople = 0;

        int groups = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= groups; i++) {
            int people = Integer.parseInt(scanner.nextLine());
            allPeople += people;
            if(people <= 5) {
                p1+= people;
            }if(people > 5 && people <= 12) {
                p2+= people;
            }if(people > 12 && people <= 25){
                p3+= people;
            }if(people > 25 && people <= 40) {
                p4+= people;
            }if(people >= 41) {
                p5+= people;
            }


        }
        System.out.printf("%.2f%%%n" , p1 * 1.0/ allPeople * 100);
        System.out.printf("%.2f%%%n" , p2 * 1.0/ allPeople * 100);
        System.out.printf("%.2f%%%n" , p3 * 1.0/ allPeople * 100);
        System.out.printf("%.2f%%%n" , p4 * 1.0/ allPeople * 100);
        System.out.printf("%.2f%%%n" , p5 * 1.0/ allPeople * 100);

    }
}
