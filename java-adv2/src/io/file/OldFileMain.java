package io.file;

import java.io.File;
import java.io.IOException;

public class OldFileMain {

    static void main(String[] args) throws IOException {
        File file = new File("temp.example.txt");
        File directory = new File("temp/exampleDir");

        System.out.println("File exists: " + file.exists());

        boolean created = file.createNewFile();
        System.out.println("File created: " + created);


    }
}
