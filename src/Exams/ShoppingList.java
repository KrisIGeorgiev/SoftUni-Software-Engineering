package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ShoppingList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       String input =  scanner.nextLine();
        List<String> list = Arrays.stream(input.split("!")).collect(Collectors.toList());
        String command = " ";
        String item = "";
        String newItem = "";
        String read = "";
       while (true) {
           read =  scanner.nextLine();
           String[] commandArr =  read.split(" ");
            command = commandArr[0];
            item = commandArr[1];
           if(command.equals("Correct")) {
           newItem = commandArr[2];
           }
           if(read.equals("Go Shopping!")){
               break;
           }
           switch (command) {
               case"Urgent":
                   if(!list.contains(item)) {
                       list.add(0, item);
                   }
                   break;
               case"Unnecessary":
                   if(list.contains(item)) {
                       list.remove(item);
                   }
                   break;
               case"Correct":

                   if(list.contains(item)) {
                       int index = list.indexOf(item);
                       list.remove(item);
                       list.add(index, newItem);

                   }
                   break;
               case"Rearrange":
                   if(list.contains(item)) {
                       list.remove(item);
                       list.add(list.size(), item);
                   }
                   break;
           }
       }
        System.out.println(String.valueOf(list)
                .replace("[", "")
                .replace("]", ""));

    }
}
