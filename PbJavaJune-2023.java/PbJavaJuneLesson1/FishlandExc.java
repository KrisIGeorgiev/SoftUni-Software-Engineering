package PbJavaJuneLesson1;

import java.util.Scanner;

public class FishlandExc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      //  •	Паламуд – 60% по-скъп от скумрията
	//Сафрид – 80% по-скъп от цацата

        double priceSkumria = Double.parseDouble(scanner.nextLine());
        double priceCaca = Double.parseDouble(scanner.nextLine());
        double kgPalamud = Double.parseDouble(scanner.nextLine());
        double kgSafrid = Double.parseDouble(scanner.nextLine());
        int kgMidi = Integer.parseInt(scanner.nextLine());

        double pricePalamud = priceSkumria +  0.6 * priceSkumria;
        double priceSafrid = priceCaca + 0.8 * priceCaca;
        double priceMidi = 7.50;

        double priceall = (kgPalamud * pricePalamud) + (kgSafrid * priceSafrid) + (kgMidi * priceMidi);

        System.out.printf("%.2f", priceall);


    }
}
