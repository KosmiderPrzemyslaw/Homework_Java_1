package day_4;

import util.ScannerUtils;

public class Main5 {
    public static void main(String[] args) {
        printTriangle();
    }

    private static void printTriangle() {
        String sign = "x" + "\t";
        String newLine = "\n";
        int a = ScannerUtils.getInt("Podaj wartość: ");
        final StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < a; i++) {
            for (int j = 0; j <= i; j++) {
                stringBuilder.append(sign);
            }
            stringBuilder.append(newLine);
        }
        System.out.println(stringBuilder);
    }
}
