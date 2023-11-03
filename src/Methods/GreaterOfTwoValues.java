package Methods;

import java.util.Scanner;

public class GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String type =  scanner.nextLine();


        switch (type){
            case"int":
                int firstNum = Integer.parseInt(scanner.nextLine());
                int secondNum = Integer.parseInt(scanner.nextLine());
                System.out.println(getMax(firstNum, secondNum));
                break;
            case"char":
                char first = scanner.nextLine().charAt(0);
                char second = scanner.nextLine().charAt(0);
                System.out.println( getMax(first , second));
                break;
            case"string":
                String firstS =  scanner.nextLine();
                String secondS =  scanner.nextLine();
                System.out.println(getMax(firstS , secondS));
                break;
        }




    }

    public static  int getMax(int firstNum , int secondNum) {
        if(firstNum > secondNum) {
            return firstNum;
        }
        return secondNum;
    }
    public static char getMax(char first, char second) {
       Character.compare(first , second);
       if(first > second) {
           return first;
       }
       return second;

        }

        public static String getMax(String firstS , String secondS) {
        if(firstS.compareTo(secondS) >= 0) {
            return firstS;
        }
        return secondS;
        }
    }

