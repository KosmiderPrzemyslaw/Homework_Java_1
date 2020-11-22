package day_4;

import java.io.*;

public class Main2 {
    public static void main(String[] args) {

    }

    private static int count(String fileName) {
        int counter = 0;
        File file = new File(fileName);

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader reader = new BufferedReader(inputStreamReader);
            String line;

            while ((line = reader.readLine()) != null) {
                if (!(line.equals(""))) {
                    String[] wordList = line.split("\\s+");
                    counter += wordList.length;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return counter;
    }
}
