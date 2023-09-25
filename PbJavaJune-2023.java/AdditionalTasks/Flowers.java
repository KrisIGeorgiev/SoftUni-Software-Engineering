package AdditionalTasks;

import java.util.Scanner;

public class Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //•	На първия ред е броят на закупените хризантеми – цяло число в интервала [0 ... 200]
        //•	На втория ред е броят на закупените рози – цяло число в интервала [0 ... 200]
        //•	На третия ред е броят на закупените лалета – цяло число в интервала [0 ... 200]
        //•	На четвъртия ред е посочен сезона – [Spring, Summer, Аutumn, Winter]
        //•	На петия ред е посочено дали денят е празник – [Y – да / N - не]

        int hrizantemi = Integer.parseInt(scanner.nextLine());
        int rozi = Integer.parseInt(scanner.nextLine());
        int laleta = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.next().charAt(0);
        int counter = hrizantemi + rozi + laleta;
        double sum = 0;
        if (holiday == 'Y') {
            if (season.equals("Spring") ) {
                sum = hrizantemi * 2.3 + rozi * 4.715 + laleta * 2.875;
                if(laleta > 7) {
                     sum = sum - 0.05 * sum;
                }if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            } else if(season.equals("Summer")){
                sum = hrizantemi * 2.3 + rozi * 4.715 + laleta * 2.875;
                if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }
            else if(season.equals("Winter")) {
                sum = hrizantemi * 4.3125 + rozi * 5.175 + laleta * 4.7725;
                if(rozi >= 10) {
                    sum = sum - 0.10 * sum;
                }if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }else if(season.equals("Autumn")) {
                sum = hrizantemi * 4.3125 + rozi * 5.175 + laleta * 4.7725;
                if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }

        } else {
            if (season.equals("Spring")) {
                sum = hrizantemi * 2 + rozi * 4.10 + laleta * 2.50;
                if(laleta > 7) {
                    sum = sum - 0.05 * sum;
                }if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            } else if (season.equals("Summer")){
                sum = hrizantemi * 2 + rozi * 4.10 + laleta * 2.50;
                if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }else if(season.equals("Winter")) {
                sum = hrizantemi * 3.75 + rozi * 4.50 + laleta * 4.15;
                if(rozi >= 10) {
                    sum = sum - 0.10 * sum;
                }if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }else if(season.equals("Autumn")) {
                sum = hrizantemi * 3.75 + rozi * 4.50 + laleta * 4.15;
                if(counter > 20) {
                    sum = sum - 0.2 * sum;
                }
            }
        }
        double end = sum + 2;
        System.out.printf("%.2f", end );
    }
}
