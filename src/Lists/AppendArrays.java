package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class AppendArrays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> seq = Arrays.stream(scanner.nextLine().split(" ")).toList();
        int count = seq.size() - 1;
        while (count >= 0) {
            while (!(seq.equals("|"))) {

            }
            count--;
        }
    }
}
