package helloworldconsulting.fileprocessing.input;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayInputStreamExample {
    public static void main(String[] args) {
        byte[] data = "Hello, ByteArrayInputStream!".getBytes();
        try (ByteArrayInputStream bais = new ByteArrayInputStream(data)) {
            int content;
            while ((content = bais.read()) != -1) {
                System.out.print((char) content);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}