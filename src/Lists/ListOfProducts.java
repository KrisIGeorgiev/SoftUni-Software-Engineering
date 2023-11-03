package Lists;

import java.util.*;

public class ListOfProducts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        String currentString = "";
        List<String> order = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            currentString =  scanner.nextLine();
            order.add(currentString);

            
        }
        Collections.sort(order);

        for (int i = 0; i < order.size(); i++) {
            System.out.printf("%d.%s%n", i + 1 ,order.get(i));
        }

        
    }
}
