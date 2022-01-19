package com.company.files;


import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("file1.txt");
        for (int i = 65; i < 91; i++) {
            fileWriter.write(i);
        }
        fileWriter.write("\n");
        for (int i = 48; i < 58; i++) {
            fileWriter.write(i);
            if (i < 57) fileWriter.write("\n");
        }

        // fileWriter.write(1040); - русская буква А

        fileWriter.close();
        FileReader fileReader = new FileReader("file1.txt");
        FileWriter fileWriter1 = new FileWriter("file2.txt");
        Scanner scan = new Scanner(fileReader);
        int i = 1;
        while(scan.hasNextLine()) {
            String fileLine = scan.nextLine();
            //System.out.println(i + " " + fileLine);
            if (i % 3 == 0) {
                fileWriter1.write(fileLine);
                System.out.println(fileLine);
            }
            i++;
        }
        fileReader.close();
        fileWriter1.close();

        // Exceptions


    }
}
