package util;

import java.util.Scanner;

public class ScannetUtils {
    public static int getInt(String prompt) {
        Scanner scanner = new Scanner(System.in);

        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie jest liczba całkowita! ");
            System.out.println(prompt);
        }
        return scanner.nextInt();
    }
}
