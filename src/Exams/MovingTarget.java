package Exams;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MovingTarget {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> nums = Arrays.stream(scanner.nextLine()
                .split(" ")).
                map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        String input = "";
        while (true) {
            input =  scanner.nextLine();
            if(input.equals("End")) {
              break;
            }
            String[] commandArr = input.split(" ");
            String command = commandArr[0];
            int first = Integer.parseInt(commandArr[1]);
            int second = Integer.parseInt(commandArr[2]);

            if(command.equals("Shoot")){
                if(first >= 0 && first <= nums.size() - 1) {
                    int shoot = nums.get(first) - second;
                    if (shoot <= 0) {
                        nums.remove(nums.get(first));
                    }else {
                        nums.remove(first);
                        nums.add(first, shoot);
                    }
                }
            }else if(command.equals("Add")) {
              if( first  < 0 || first >= nums.size() - 1) {
                  System.out.println("Invalid placement!");
              }else {
                  nums.add(first , second);
              }
            }else if(command.equals("Strike")) {
              if(first >= 0 && first <= nums.size() - 1 && first + second <= nums.size() - 1 && first - second >= 0) {
                  for (int i = first - second; i <= first + second ; i++) {
                      nums.remove(first - second);
                  }
              }else {
                  System.out.println("Strike missed!");
              }
            }
        }
        for(int n : nums) {
            if(n == nums.get(nums.size() - 1)) {
                System.out.println(n);
                break;
            }
            System.out.print( n + "|");
        }



    }
}
