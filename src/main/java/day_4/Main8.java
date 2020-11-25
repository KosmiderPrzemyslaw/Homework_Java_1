package day_4;

import java.io.*;

public class Main8 {
    public static void main(String[] args) {
        String filename = "main4copy.txt";
        try {
            System.out.println(count(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            readFile(filename);
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println(readFileUsingStringBulider(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readFile(String filename) throws IOException {
        char[] array = new char[200];

        FileReader input = null;
        try {
            input = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            input.read(array);
            System.out.println("Data in the file: ");
            System.out.println(array);
            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder readFileUsingStringBulider(String filename) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Reading file - using FileInputStream, InputStreamReader and BufferedReader classes: " + "\n");
        File file = new File(filename);
        BufferedReader bufferedReader = null;
        String gap;
        int count = 0;

        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        bufferedReader = new BufferedReader(inputStreamReader);

        while ((gap = bufferedReader.readLine()) != null) {
            stringBuilder.append(gap).append("\n");
        }
        return stringBuilder;
    }

    private static int count(String fileName) throws IOException {
        File file = new File(fileName);
        int count = 0;
        String data;
        FileInputStream fileInputStream = new FileInputStream(file);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        while ((data = bufferedReader.readLine()) != null) {
            count += data.length();
        }
        return count;
    }
}
