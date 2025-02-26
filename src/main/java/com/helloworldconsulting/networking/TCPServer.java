package com.helloworldconsulting.networking;

import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println("Server is listening on port 8080...");
            Socket socket = serverSocket.accept(); // Wait for a client to connect
            System.out.println("Client connected!");

            InputStream input = socket.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(input));
            String message = reader.readLine();
            System.out.println("Received: " + message);

            OutputStream output = socket.getOutputStream();
            PrintWriter writer = new PrintWriter(output, true);
            writer.println("Hello, client!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

