package AdditionalTasks;

import java.util.Scanner;

public class SchoolCamp

{
    //1.	Сезонът – текст - “Winter”, “Spring” или “Summer”;
    //2.	Видът на групата – текст - “boys”, “girls” или “mixed”;
    //3.	Брой на учениците – цяло число в интервала [1 … 10000];
    //4.	Брой на нощувките – цяло число в интервала [1 … 100].
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String season =  scanner.nextLine();
        String groupType =  scanner.nextLine();
        int students = Integer.parseInt(scanner.nextLine());
        int nights = Integer.parseInt(scanner.nextLine());
        double priceNight = 0;
        double percentage = 0;
        String sport = "";

        if(season.equals("Winter")) {
            if(groupType.equals("boys")) {
                priceNight = 9.60;
                sport = "Judo";
            }else if(groupType.equals("girls")){
                priceNight = 9.60;
                sport = "Gymnastics";
            }
            else {
                priceNight = 10;
                sport = "Ski";
            }
        }else if(season.equals("Spring")) {
            if(groupType.equals("boys")) {
                priceNight = 7.20;
                sport = "Tennis";
            }else if(groupType.equals("girls")){
                priceNight = 7.20;
                sport = "Athletics";
            }
            else {
                priceNight = 9.5;
                sport = "Cycling";
            }
        }else {
            if(groupType.equals("boys")) {
                priceNight = 15;
                sport = "Football";
            }else if(groupType.equals("girls")){
                priceNight = 15;
                sport = "Volleyball";
            }
            else {
                priceNight = 20;
                sport = "Swimming";
            }

        }
        if(students >= 50) {
            percentage = 0.5;
        }else if(students >= 20 && students < 50) {
            percentage = 0.15;
        }else if(students >= 10 && students < 20) {
            percentage = 0.05;
        }
        double Final =  students * nights * priceNight   - (percentage *(nights * priceNight * students ));

        System.out.printf("%s %.2f lv. ", sport , Final);



    }
}
