package homeworks;

import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {

        System.out.printf("Currency Exchange: %n How much dollars, you want to exchange? ");


        double response = convertUsdToPln(2);
    }

    public static double convertUsdToPln(double exchangeRate) {
        Scanner scanner = new Scanner(System.in);
        int usd = scanner.nextInt();
        double convertUsdToPln = (usd * exchangeRate);
        System.out.println("You collected  " + convertUsdToPln + " PLN");
        return (int) convertUsdToPln;

    }
}

