package com.helloworldconsulting.fileprocessing.output;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, BufferedOutputStream!";
        try (BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("buffered_output.txt"))) {
            bos.write(data.getBytes());
            bos.flush();  // Ensures all data is written to the file
            System.out.println("Data written using BufferedOutputStream.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}