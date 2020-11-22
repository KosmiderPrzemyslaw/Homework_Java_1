package day_4;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(count("/home/przemysaw/Pulpit/test/skad2.txt"));
    }

    private static int count(String filePath) {
        int count = 0;
        String data;
        File file = new File(filePath);
        BufferedReader reader = null;

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            reader = new BufferedReader(inputStreamReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            while ((data = reader.readLine()) != null) {
                count += data.length();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return count;
    }
}
