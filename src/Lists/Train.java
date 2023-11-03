package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Train {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream
                (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int capacity = Integer.parseInt(scanner.nextLine());
        int index = 0;
        String input = "";
        while (!input.equals("end")) {
            input =  scanner.nextLine();
            if(input.equals("end")) {
                break;
            }

            String[] arr = input.split(" ");
            String command = arr[0];
            if(command.equals("Add")) {
                 index = Integer.parseInt(arr[1]);
                 nums.add(nums.size()  , index);
            }else {
                index = Integer.parseInt(arr[0]);
                for (int i = 0; i <= nums.size() - 1; i++) {
                    if(index + nums.get(i) <= capacity) {
                        nums.add(i, index + nums.get(i));
                        nums.remove(i + 1);
                        break;
                    }
                }
            }

        }
        for (int n : nums) {
            System.out.print(n + " ");
        }

    }
}
