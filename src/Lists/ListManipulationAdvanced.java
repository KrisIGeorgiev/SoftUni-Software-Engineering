package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationAdvanced {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> number = Arrays.stream
                        (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        String input = "";
        while (!input.equals("end")) {
            input = scanner.nextLine();
            String[] arr = input.split(" ");
            if(input.equals("end")){
                return;
            }
            int index = 0;
            String condition = "";
            String command = arr[0];
            if(command.equals("Print") || command.equals("Get") ) {
                 condition = arr[1];
            }else if(command.equals("Filter")) {
                 condition = arr[1];
                 index = Integer.parseInt(arr[2]);
            }else {
                 index = Integer.parseInt(arr[1]);
            }

            switch (command) {
                case"Contains":
                    if(number.contains(index)) {
                        System.out.println("Yes");
                    }else {
                        System.out.println("No such number");
                    }
                    break;
                case"Print":
                    if(condition.equals("even")) {
                        for (int n: number) {
                            if(n % 2 == 0) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }else {
                        for (int n: number) {
                            if(n % 2 == 1) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;
                case"Get":
                    int sum = 0;
                    for (int n : number) {
                         sum += n;

                    }
                    System.out.println(sum);
                    break;
                case"Filter":
                    if(condition.equals("<")){
                        for (int n : number){
                            if(n < index) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }else if (condition.equals(">")){
                        for (int n : number){
                            if(n > index) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }else if (condition.equals(">=")) {
                        for (int n : number){
                            if(n >= index) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }else {
                        for (int n : number){
                            if(n <= index) {
                                System.out.print(n + " ");
                            }
                        }
                        System.out.println();
                    }
                    break;

            }


        }

    }
}
