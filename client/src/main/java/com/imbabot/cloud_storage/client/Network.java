package com.imbabot.cloud_storage.client;

import java.io.*;
import java.net.Socket;

public class Network {
    private Socket socket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public Network(int port) throws IOException {
        socket = new Socket("localhost", port);
        in = new ObjectInputStream(socket.getInputStream());
        out = new ObjectOutputStream(socket.getOutputStream());
    }

    public void close(){
        try {
            if (in != null) {
                in.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }



        try {
            if (out != null) {
                out.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


        try {
            if (socket != null) {
                socket.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
