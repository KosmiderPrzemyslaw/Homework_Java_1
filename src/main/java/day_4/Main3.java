package day_4;

import util.ScannerUtils;

import java.math.BigDecimal;

public class Main3 {
    public static void main(String[] args) {
        ScannerUtils scannerUtils = new ScannerUtils();

        int anInt = scannerUtils.getInt("Podaj liczbę: ");

        System.out.println("Podana liczba : " + anInt);

        BigDecimal bigDecimal = scannerUtils.getBigDecimal("Podaj kwotę po przecinku: ");

        System.out.println("Podana kwota " + bigDecimal);

    }
}
