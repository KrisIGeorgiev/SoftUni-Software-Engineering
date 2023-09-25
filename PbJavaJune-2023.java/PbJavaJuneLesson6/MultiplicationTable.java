package PbJavaJuneLesson6;



public class MultiplicationTable {
    public static void main(String[] args) {
        int sum = 0;
        for(int x = 1; x <= 10 ; x++) {
            for(int y = 1 ; y <= 10; y++) {
                sum = x * y;
                System.out.printf("%d * %d = %d%n" , x , y, sum );

            }
        }


    }
}
