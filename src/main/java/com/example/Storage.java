package com.example;

import java.io.FileWriter;
import java.io.IOException;



public class Storage {
    public static void writeToFile(String content){
        try {
            trywriteToFile(content);
        } catch (IOException e) {
            System.err.println("Hiba! A fájl nem írható!");
            System.err.println(e.getMessage());
        }   
    }

    public static void trywriteToFile(String content) throws IOException  {
        FileWriter fileWriter = new FileWriter("adat.txt");
        fileWriter.write(content);
        fileWriter.close();
    }
}
