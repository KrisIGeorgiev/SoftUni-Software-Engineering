package ObjectsAndClasses;

import java.util.*;
import java.util.stream.Collectors;

public class RandomizeWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> list = Arrays.stream
                (scanner.nextLine()
                        .split(" "))
                .collect(Collectors.toList());

        List<String> result = new ArrayList<>();

        Random rdm = new Random();
        int listLens = list.size();
        for (int i = 0; i < listLens; i++) {
            int idx = rdm.nextInt(list.size());


           result.add(list.get(idx));
           list.remove(idx);

        }

        for (String word : result) {
            System.out.println(word);
        }


    }
}
