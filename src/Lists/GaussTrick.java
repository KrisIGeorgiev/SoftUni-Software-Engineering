package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class GaussTrick {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> nums = Arrays.stream
                (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());
        int realNum = nums.size();
        if(nums.size() % 2 == 0) {
            for (int i = 0; i < realNum / 2 ; i++) {
                nums.set(i, nums.get(i) + nums.get(realNum - i - 1));
                nums.remove(realNum - i - 1);
            }
        }else {

            nums.add(nums.size() / 2 , 0 );
            realNum = nums.size();
            for (int i = 0; i < realNum / 2; i++) {
                nums.set(i, nums.get(i) + nums.get(realNum - i - 1));
                nums.remove(realNum - i - 1);
            }

        }
        for (int numbs : nums) {
            System.out.print(numbs + " ");
        }

    }
}
