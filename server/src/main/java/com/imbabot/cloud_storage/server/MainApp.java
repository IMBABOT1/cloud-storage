package com.imbabot.cloud_storage.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MainApp {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Server is running waiting for clients...");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connect");
            DataOutputStream out = new DataOutputStream(socket.getOutputStream());
            DataInputStream in = new DataInputStream(socket.getInputStream());

            while (true){
                int x = socket.getInputStream().read();
                System.out.println((char) x);
            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
