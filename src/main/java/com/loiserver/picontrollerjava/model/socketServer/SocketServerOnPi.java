package com.loiserver.picontrollerjava.model.socketServer;

import com.loiserver.picontrollerjava.model.communicationWithCamera.InformationFromOpencvToPi;
import com.loiserver.picontrollerjava.model.operatingData.OperatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.ServerSocket;
import java.net.Socket;

@Component
public class SocketServerOnPi {
    private ServerSocket server;
    private Socket client;
    private int port;
    @Autowired
    private OperatingData operatingData;


    public SocketServerOnPi() throws Exception{
//        server = new ServerSocket(port);
//        client = null;
        this.port = 9899;
    }
    public void listen() throws Exception{
        ServerSocket server = new ServerSocket(port);
//        Socket client = null;

        while (true){
            client = server.accept();
            System.out.println("connect client success!");
            new Thread(new SocketServerThread(client, operatingData)).start();
        }


    }

    public void stopListen() throws Exception{
        server.close();
    }
}
