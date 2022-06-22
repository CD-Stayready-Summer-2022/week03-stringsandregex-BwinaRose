package com.codedifferentlty.regex.practice.part02.readingFiles;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingInDataMethod02 {
    public static String readDataIn(String filePath){
        StringBuilder builder = new StringBuilder();
        try (BufferedReader buffer = new BufferedReader(
                new FileReader(filePath))) {
            String str;
            while ((str = buffer.readLine()) != null) {

                builder.append(str).append("\n");
            }
        } catch (IOException ex) {
            System.out.println("Error: no file "+ex.getMessage());
        }
        return builder.toString();
    }
}
