package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayModifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "";
        int counter = 0;




        int[] numbers = Arrays.stream
                        (scanner.nextLine().split(" "))
                .mapToInt(e -> Integer.parseInt(e))
                .toArray();

        while (!input.equals("end")) {
             input =  scanner.nextLine();
            String[] command = input.split(" ");
            String commandType = command[0];

            switch (commandType){
                case "swap":
                    int index1 = Integer.parseInt(command[1]);
                    int index2 = Integer.parseInt(command[2]);
                  int firstElement = numbers[index1];
                  int secondElement = numbers[index2];

                  numbers[index1] = secondElement;
                  numbers[index2] = firstElement;
                    break;
                case"multiply":
                    int index3 = Integer.parseInt(command[1]);
                    int index4 = Integer.parseInt(command[2]);
                    int third = numbers[index3];
                    int fourth = numbers[index4];
                    numbers[index3] =third * fourth;

                    break;
                case"decrease":
                    for (int i = 0; i < numbers.length; i++) {
                        numbers[i] -= 1;
                    }
                    break;
            }


        }
        for (int text : numbers) {

            if(counter == numbers.length - 1  ) {
                System.out.println(text);
                break;
            }
            System.out.print(text + ", ");
            counter++;
        }
    }
}
