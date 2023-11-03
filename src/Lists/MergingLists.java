package Lists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MergingLists {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> firstSeq = Arrays.stream
                        (scanner.nextLine()
                        .split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> secondSeq = Arrays.stream
                        (scanner.nextLine()
                                .split(" "))
                .map(e -> Integer.parseInt(e))
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>();

        int firstSeqIdx = 0;
        int secondSeqIdx = 0;


        while (firstSeqIdx < firstSeq.size() && secondSeqIdx < secondSeq.size()) {
            int firstNum = firstSeq.get(firstSeqIdx);
            int secondNum = secondSeq.get(secondSeqIdx);
            result.add(firstNum);
            result.add(secondNum);

            firstSeqIdx++;
            secondSeqIdx++;
        }

        for (int i = firstSeqIdx; i < firstSeq.size(); i++) {
            result.add(firstSeq.get(i));
        }
        for (int i = secondSeqIdx; i < secondSeq.size(); i++) {
            result.add(secondSeq.get(i));
        }
       for (int numbs : result) {
           System.out.print(numbs + " ");
       }
    }
}
