package day_4;

import util.ScannerUtils;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Main3 {
    public static void main(String[] args) {

        int anInt = ScannerUtils.getInt("Podaj liczbę: ");

        System.out.println("Podana liczba : " + anInt);


        BigDecimal bigDecimal = ScannerUtils.getBigDecimal("Podaj kwotę po przecinku: ");

        DecimalFormat decimalFormat = new DecimalFormat("##.00");
        decimalFormat.format(bigDecimal);
        System.out.println("Podana kwota " + decimalFormat.format(bigDecimal));

    }
}
