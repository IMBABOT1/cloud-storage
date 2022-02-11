package com.imbabot.cloud_storage.client;

import javafx.fxml.Initializable;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.ResourceBundle;

public class Controller implements Initializable {

    private Network network;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            network = new Network(8189);

            Cat cat = new Cat("Name", 123);
            network.sendFile(cat);

        }catch (IOException e){
            throw new RuntimeException("Impossible connect to server");
        }
    }
}
