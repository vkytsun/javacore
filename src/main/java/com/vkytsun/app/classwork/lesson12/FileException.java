package com.vkytsun.app.classwork.lesson12;

import java.io.*;

public class FileException {
    public static void fileReader() throws Exception{
        BufferedReader reader = new BufferedReader(new FileReader("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson12/input.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }

    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson12/input.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("Regardless about exception you\n" +
                    "will see this text");
        }
    }
    public static void readTheFile(String path) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = reader.readLine()) != null) {
            System.out.println(line);
        }
        reader.close();
    }
    /*Read string from input.txt file and write if this string
    is palindrome or not to output.txt file in same directory*/
    public static void filePolindrome() throws IOException {
        BufferedReader reader = new BufferedReader(
                new FileReader("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson11/inputPolindrome.txt"));
        BufferedWriter writer = new BufferedWriter(
                new OutputStreamWriter(
                        new FileOutputStream("/home/vkytsun/IdeaProjects/javacore/src/test/java/resources/classwork/lesson11/outputPolindrome.txt")));
        String line;
        while ((line = reader.readLine()) != null) {
            StringBuilder stringBuilder = new StringBuilder(line);
            if (stringBuilder.toString().equals(stringBuilder.reverse().toString())) {
                writer.append(line);
                writer.close();
            }
        }

    }
}

