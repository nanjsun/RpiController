package com.loiserver.picontrollerjava.model;

import org.springframework.stereotype.Component;

import java.net.ServerSocket;
import java.net.Socket;

@Component
public class SocketServerOnPi {
//    private ServerSocket server;
//    private Socket client;
    private int port;

    public SocketServerOnPi() throws Exception{
//        server = new ServerSocket(port);
//        client = null;
        this.port = 9899;
    }
    public void listen() throws Exception{
        ServerSocket server = new ServerSocket(port);
        Socket client = null;
        boolean f = true;
        while (f){
            client = server.accept();
            System.out.println("connect client success!");
            new Thread(new SocketServerThread(client)).start();
        }
        server.close();
    }
}
