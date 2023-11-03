package Exams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Inventory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> journal  = Arrays.stream
                (scanner.nextLine()
                        .split(", "))
                .collect(Collectors.toList());
        String input = "";
        String item = "";
        String special = "";
        String command = "";
        while (true) {
             input = scanner.nextLine();
             if(input.equals("Craft!")) {
                 break;
             }
            String[] commandArr = input.split(" - ");
             command = commandArr[0];
            if(command.equals("Combine Items")) {
                 String [] index = commandArr[1].split(":");
                 special = index[0];
                 item = index[1];
            }else {
                item = commandArr[1];
            }

            switch (command) {
                case"Collect":
                    if(!journal.contains(item)) {
                        journal.add(journal.size(), item);
                    }
                    break;
                case"Drop":
                    if(journal.contains(item)) {
                        journal.remove(item);
                    }
                    break;
                case"Combine Items":
                    if(journal.contains(special)) {
                        journal.add(journal.indexOf(special) + 1, item );
                    }
                    break;
                case"Renew":
                    if(journal.contains(item)) {
                        journal.remove(item);
                        journal.add(journal.size(), item);
                    }
                    break;
            }

        }
        System.out.println(String.valueOf(journal)
                .replace("[", "")
                .replace("]", ""));

    }
}
