package com.vkytsun.runners.classwork;


import com.vkytsun.app.classwork.lesson12.FileException;

import java.io.*;

public class Lesson12Runner {
    public static void main(String[] args) throws IOException {
        FileException.filePolindrome();
        //FileException.readTheFile();

        /*BufferedReader reader = new BufferedReader(new FileReader("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson12/input.txt"));
        String line;
        String stringToCompare = "Hello world!";
        for (int i = 0; i < 2 ; i++) {
            line = reader.readLine();
            if (line.equals(stringToCompare)) System.out.println("OK");
        }
        reader.close();*/

        /*String firstLine = "The first line";
        String secondLine = "The second line";
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson11/input.txt")));
        writer.append(firstLine);
        writer.newLine();
        writer.append(secondLine);
        writer.close();*/
    }
}
