package PbJavaJuneExam;

import java.util.Scanner;

public class SubstituteHARDEST {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //K – цяло число в интервала [0..8]
        //• L – цяло число в интервала [0..9]
        //• M– цяло число в интервала [0..8]
        //• N – цяло число в интервала [0..9]

        int k = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());
        int first = 0;
        int second = 0;
        int third = 0;
        int fourth = 0;
        int counterChanges = 0;
        int more = 0;
        outerloop:
        for (int i = k; i >= k && i <= 8; i++) {
            first = i;
            if (first % 2 == 0) {




            for (int j = 9; j <= 9 && j >= l; j--) {
                second = j;
                if (second % 2 == 1) {


                    for (int r = m; r <= 8 && r >= m; r++) {
                        third = r;
                        if (third % 2 == 0) {


                            for (int h = 9; h <= 9 && h >= n; h--) {
                                fourth = h;
                                if (fourth % 2 == 1) {


                                    String firstS = Integer.toString(first);
                                    String secondS = Integer.toString(second);
                                    String thirdS = Integer.toString(third);
                                    String fourthS = Integer.toString(fourth);

                                    String firstNumS = firstS + secondS;
                                    String secondNumS = thirdS + fourthS;

                                    int firstNumber = Integer.parseInt(firstNumS);
                                    int secondNumber = Integer.parseInt(secondNumS);
                                    if (firstNumber == secondNumber) {
                                        System.out.println("Cannot change the same player.");
                                    } else {
                                        System.out.printf("%d%d - %d%d%n", first, second, third, fourth);
                                        counterChanges++;
                                    }

                                    if (counterChanges == 6) {
                                        break outerloop;
                                    }

                                }
                            }


                        }
                    }

                }
            }


        }
        }

    }
}
