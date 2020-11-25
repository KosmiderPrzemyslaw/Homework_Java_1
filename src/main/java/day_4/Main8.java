package day_4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

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

            System.out.println(readFileUsingStringBuilderAndBufferedReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Reading file using Scanner and ArrayList");
            System.out.println(readFileUsingScannerAndArrayList(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            System.out.println("Reading file using BufferedReader");
            System.out.println(readFileUsingBufferedReaderAndFileReader(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuffer readFileUsingBufferedReaderAndFileReader(String filename) throws IOException {
        File file = new File(filename);
        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        String dataFromFile;
        StringBuffer stringBuffer = new StringBuffer();
        while ((dataFromFile = bufferedReader.readLine()) != null) {
            System.out.println(dataFromFile);
            stringBuffer.append(dataFromFile);
        }
        return stringBuffer;
    }

    private static void readFile(String filename) throws IOException {
        char[] array = new char[200];
        int i;
        FileReader input = null;
        try {
            input = new FileReader(filename);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        try {
            //input.read(array);
            while ((i = input.read()) != -1) {
                System.out.print((char) i);
            }
//            System.out.println("Data in the file: ");
//            System.out.println(array);
//            input.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static StringBuilder readFileUsingStringBuilderAndBufferedReader(String filename) throws IOException {

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

    private static List<String> readFileUsingScannerAndArrayList(String fileName) throws IOException {
        File file = new File(fileName);
        List<String> stringList = new ArrayList<>();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNextLine()) {
            stringList.add(scanner.nextLine());
            scanner.close();
        }
        return stringList;
    }
}
