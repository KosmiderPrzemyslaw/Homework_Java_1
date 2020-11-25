package day_4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {

        File file = new File("main4copy.txt");
        //File file = new File("/home/przemysaw/IdeaProjects/tests_junit/Homework_Java_01/src/main/java/day_4/main4.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine())  ;
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
