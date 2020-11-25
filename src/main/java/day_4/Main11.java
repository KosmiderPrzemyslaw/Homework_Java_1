package day_4;

import java.io.FileNotFoundException;
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
        printWriter.close();
    }
}
