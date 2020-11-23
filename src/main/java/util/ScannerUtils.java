package util;

import java.math.BigDecimal;
import java.util.Scanner;

public class ScannerUtils {

    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie jest liczba całkowita! ");
            System.out.println(prompt);
        }
        return scanner.nextInt();
    }

    public static BigDecimal getBigDecimal(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(prompt);

        while (!scanner.hasNextBigDecimal()) {
            scanner.next();
            System.out.println("Nieprawidłowa kwota!");
            System.out.println(prompt);
        }
        return scanner.nextBigDecimal();
    }
}
