package Lists;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class CardsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> deck1 = Arrays.stream
                (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> deck2 = Arrays.stream
                        (scanner.nextLine().split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        int a  = 0;


        while ( !(deck1.isEmpty() || deck2.isEmpty())) {                // 20 30 40 50
            if(deck1.get(a) == deck2.get(a)) {                          //  20 30 40
                deck1.remove(a);
                deck2.remove(a);
            }else if(deck1.get(a) > deck2.get(a)) {
              deck1.add(deck1.size() , deck1.get(a));
              deck1.add(deck1.size() , deck2.get(a));
              deck2.remove(a);
              deck1.remove(a);
            }else {
                deck2.add(deck2.size() , deck2.get(a));
                deck2.add(deck2.size() , deck1.get(a));
                deck1.remove(a);
                deck2.remove(a);
            }
        }
        boolean isDeck1 = deck1.isEmpty();
        int sum = 0;
        if(!isDeck1) {
            for (int n : deck1) {
                 sum += n;

            }
            System.out.printf("First player wins! Sum: %d", sum);
        }else {
            for (int n : deck2) {
                sum += n;

            }
            System.out.printf("Second player wins! Sum: %d", sum);
        }



    }
}
