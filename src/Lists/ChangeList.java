package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ChangeList {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream
                (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        String input =  "";
        while (!input.equals("end")) {
            int element = 0;
            input =  scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            String[] arr = input.split(" ");
            String command = arr[0];
            if(command.equals("Insert")){
                element = Integer.parseInt(arr[2]);
            }
            int index = Integer.parseInt(arr[1]);

            switch (command) {
                case"Delete":
                    nums.removeIf(e ->e == index);
                    break;
                case"Insert":
                    nums.add(element , index);
                    break;
            }
        }
        for (int n : nums) {
            System.out.print(n + " ");
        }
    }
}
