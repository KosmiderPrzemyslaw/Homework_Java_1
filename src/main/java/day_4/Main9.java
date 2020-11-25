package day_4;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main9 {
    public static void main(String[] args) {

        try {
            rewriteFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void rewriteFile() throws IOException {
        String sourceFile = "pom.xml";
        Path source = Paths.get(sourceFile);
        Path destFile = Paths.get(sourceFile + "_2");

        if (!Files.exists(source)) {
            throw new IOException("File doesn't exist!");
        }
        List<String> stringList = new ArrayList<>(Files.readAllLines(Paths.get(sourceFile)));
        stringList.addAll(stringList);
        Files.write(destFile, stringList);
    }
}


