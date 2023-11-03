package Lists;

import java.awt.*;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ListManipulationBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int additional = 0;
        String input = "";
        while (!input.equals("end")) {
            input = scanner.nextLine();
            if(input.equals("end")) {
                break;
            }
            String[] coomandArr = input.split(" ");
            String command = coomandArr[0];
            if(command.equals("Insert")) {
                 additional = Integer.parseInt(coomandArr[2]);
            }
            int index = Integer.parseInt(coomandArr[1]);

            switch (command) {
                case "Add":
                    nums.add(nums.size() , index );
                    break;
                case"Remove":
                  nums.remove(Integer.valueOf(index));

                    break;
                case"RemoveAt":
                    nums.remove(index);
                    break;
                case"Insert":
                    nums.add(additional , index);
            }
        }
        for (int num : nums) {
            System.out.print(num + " ");
        }


    }
}
