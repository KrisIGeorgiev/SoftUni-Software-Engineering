package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class BombNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       List<Integer> nums = Arrays.stream(scanner.nextLine()
               .split(" "))
               .map(e -> Integer.parseInt(e))
               .collect(Collectors.toList());

       int bombNum = Integer.parseInt(scanner.next());
       int pow = Integer.parseInt(scanner.next());
       int h = 1;
       int right = 0;

        for (int i = 0; i < nums.size() - 1; i++) {
            if(nums.get(i) == bombNum) {
                nums.remove(Integer.valueOf(bombNum));
                 right = nums.size()  - i;
                for (int j = 0; j < pow; j++) {
                    nums.remove(i - h );
                    h++;
                }
                int a = 1;
                int b = 1;
                if(right >= pow) {
                    for (int j = 0; j < pow; j++) {
                        nums.remove(i - a);
                        a++;
                    }
                }else {
                    while (right > 0 ) {
                        nums.remove(nums.size() - b);
                        right--;


                    }
                }

            }
        }
        int sum = 0;
        for (int n : nums) {
            sum += n;
        }
        System.out.println(sum);
    }
}
//    1 4 2 1
