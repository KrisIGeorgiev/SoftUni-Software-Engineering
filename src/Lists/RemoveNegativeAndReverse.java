package Lists;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class RemoveNegativeAndReverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream
                        (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        nums.removeIf(n -> n < 0);
        Collections.reverse(nums);
        if(nums.isEmpty()) {
            System.out.println("empty");
        }else {
            for (int n : nums) {
                System.out.print(n + " ");
            }
        }



    }
}
