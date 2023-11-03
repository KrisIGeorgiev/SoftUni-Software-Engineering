package Lists;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SumAdjacentEqualNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Double> nums = Arrays.stream(scanner.nextLine()
                .split(" "))
                .map(e -> Double.parseDouble(e))
                .collect(Collectors.toList());


        for (int i = 0; i < nums.size() - 1 ; i++) {
            double currentNum = nums.get(i);
            double nextNum = nums.get(i + 1);

            if(currentNum == nextNum) {
                nums.set(i, currentNum + nextNum);
                nums.remove(i + 1);
                i = -1;
            }
        }
        for (double numbers : nums) {
            System.out.print(new DecimalFormat("0.###").format(numbers) + " ");
        }
    }
}
