package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        List<String> list = Arrays.stream
                        (input.split("&"))
                .collect(Collectors.toList());

        while (true) {
            input = scanner.nextLine();
            if (input.equals("Done")) {
                break;
            }
            String[] currentArr = input.split(" \\| ");
            String command = currentArr[0];
            String book2 = "";
            if (command.equals("Swap Books")) {
                book2 = currentArr[2];
            }
            String book = currentArr[1];

            switch (command) {
                case "Add Book":
                    if (!list.contains(book)) {
                        list.add(0, book);
                    }
                    break;
                case "Take Book":
                    if (list.contains(book)) {
                        list.remove(book);
                    }
                    break;
                case "Swap Books":
                    if (list.contains(book) && list.contains(book2)) {
                        list.add(list.indexOf(book) + 1, book2);
                        list.add(list.indexOf(book2) + 1, book);
                        list.remove(book);
                        list.remove(book2);
                    }
                    break;
                case "Insert Book":
                    if (!list.contains(book)) {
                        list.add(list.size(), book);
                    }
                    break;
                case "Check Book":
                    int index = Integer.parseInt(book);
                    if (index < list.size()) {
                        System.out.println(list.get(index));
                    }
                    break;
            }


        }

        System.out.println(String.join(", ", list));

    }
}
