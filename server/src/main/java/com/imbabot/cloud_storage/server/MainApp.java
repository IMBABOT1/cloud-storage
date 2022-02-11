package com.imbabot.cloud_storage.server;

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
            ObjectInputStream in = new MarshalInputStream(socket.getInputStream());
            while (true){

            }

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
