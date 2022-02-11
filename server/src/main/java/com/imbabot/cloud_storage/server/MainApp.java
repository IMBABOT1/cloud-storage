package com.imbabot.cloud_storage.server;

import com.imbabot.cloud_storage.client.Cat;
import sun.rmi.server.MarshalInputStream;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class MainApp {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)){
            System.out.println("Server is running waiting for clients...");
            Socket socket = serverSocket.accept();
            System.out.println("Client is connect");
            ObjectOutputStream out = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream in = new ObjectInputStream(socket.getInputStream());


            Cat cat = null;
            try {
               cat = (Cat) in.readObject();
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }

            System.out.println(cat);


        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
