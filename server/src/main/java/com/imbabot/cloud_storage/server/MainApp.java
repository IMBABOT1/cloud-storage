package com.imbabot.cloud_storage.server;

import java.io.IOException;
import java.net.ServerSocket;

public class MainApp {

    public static void main(String[] args) {
        try (ServerSocket serverSocket = new ServerSocket(8189)){

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
