package PbJavaJuneLesson6;

import java.util.Scanner;

public class Building {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int stock = Integer.parseInt(scanner.nextLine());
        int rooms = Integer.parseInt(scanner.nextLine());

        for(int i = stock; i > 0 ; i--) {
            outerloop:                                                   //
            if(i % 2 == 0) {
                if(i == stock) {
                    for(int b = 0; b < rooms ; b++) {
                        if(b == rooms - 1) {

                        }
                        System.out.printf("L%d%d " , i , b  );
                        //


                    }
                    System.out.printf("%n");
                    break outerloop;
                }
                for(int b = 0; b < rooms; b++){

                        System.out.printf("O%d%d ",  i ,  b);
                     if (b == rooms - 1) {
                        System.out.printf("%n");


                    }
                }

            }
            justloop:
             if(i % 2 != 0) {
                if (i == stock) {
                    for(int b = 0; b < rooms; b++) {
                        System.out.printf("L%d%d " , i , b);
                    }
                    System.out.printf("%n");
                    break justloop;
                }
                for(int b = 0; b < rooms; b++) {

                        System.out.printf("A%d%d " , i , b);
                    if (b == rooms - 1) {
                        System.out.printf("%n");

                    }

                }
            }
        }

    }
}
