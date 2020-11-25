package day_4;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Main11 {
    public static void main(String[] args) {
        PrintWriter printWriter = null;
        try {
            printWriter = new PrintWriter("writeFile.txt");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        printWriter.println("first line");
        printWriter.println("second line");
        printWriter.write("use print write method");
        printWriter.append(" use append charsequence"); //add to last line
        printWriter.close();

        try {
            FileWriter fileWriter = new FileWriter("writeFile.txt", true);
            //drugi parametr informuje czu mamy zastąpić istniejące dane czy dopisywać nowe dane do pliku
            fileWriter.append("file writer first line");
            fileWriter.append("file writer second line");
            fileWriter.append("\n file writer third line");
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Błąd zapisu do pliku");
        }
    }
}
