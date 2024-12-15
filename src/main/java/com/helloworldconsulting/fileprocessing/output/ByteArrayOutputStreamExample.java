package helloworldconsulting.fileprocessing.output;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayOutputStreamExample {
    public static void main(String[] args) {
        String data = "Hello, ByteArrayOutputStream!";
        try (ByteArrayOutputStream baos = new ByteArrayOutputStream()) {
            baos.write(data.getBytes());
            System.out.println("Data written to ByteArrayOutputStream: " + baos.toString());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}