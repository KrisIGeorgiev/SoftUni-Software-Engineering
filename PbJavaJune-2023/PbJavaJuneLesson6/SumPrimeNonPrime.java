package PbJavaJuneLesson6;

import java.util.Scanner;
import java.math.RoundingMode;


public class SumPrimeNonPrime {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String input = "";
        int currentNumber = 0;
        int sumPrime = 0;
        int sumNonPrime = 0;

outerloop:
        while (!(input.equals("stop"))){
            input  =  scanner.nextLine();
            if(input.equals("stop")) {
                break outerloop;

            }innerloop:
                 if (!input.equals("stop")){
                 currentNumber = Integer.parseInt(input);
                 if(currentNumber < 0 ) {
                     System.out.println("Number is negative.");
                     break innerloop;
                 }

                 boolean isPrime = true;

                 for(int divisor = 2; divisor < currentNumber - 1; divisor++) {
                     if(currentNumber % divisor == 0){
                         isPrime = false;
                         break;
                     }
                 }

                 if(isPrime) {
                     sumPrime += currentNumber;
            }else{
                      sumNonPrime+= currentNumber;
                 }


            }





        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d%n" , sumNonPrime);
    }


    }

