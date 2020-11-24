package day_4;

import java.io.BufferedReader;
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Main1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(count("/home/przemysaw/IdeaProjects/KAT_JEE_W_03_Podstawy/b_Zadania_Domowe/a_Dzien_4/textDoMain3.txt")));
    }

    private static int[] count(String filePath) {
        int countChars = 0;
        String data;
        File file = new File(filePath);
        BufferedReader reader = null;
        int countWords = 0;
        int[] returnInt = new int[2];

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            reader = new BufferedReader(inputStreamReader);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            assert reader != null; //reader nie może być nullem
            while ((data = reader.readLine()) != null) {
                countChars += data.length();
                String[] s = data.split(" ");
                for (String stringFromFile : s
                ) {
                    countWords++;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        returnInt[0] = countChars;
        returnInt[1] = countWords;
        return returnInt;
    }
}
