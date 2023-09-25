import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int realNumber = n;
        int sum = 1;
        int sumReal = 0;


        while (n > 0 ) {
            sum = 1;
            int lastDigit = n % 10;
            for (int i = 1; i <= lastDigit ; i++) {
                sum *= i;


            }
            sumReal += sum;

            n /= 10;
        }
        if(realNumber == sumReal) {
            System.out.println("yes");
        }else {
            System.out.println("no");
        }

    }
}