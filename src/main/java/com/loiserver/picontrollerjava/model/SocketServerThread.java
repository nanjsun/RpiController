package com.loiserver.picontrollerjava.model;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class SocketServerThread implements Runnable {

    private Socket client = null;
    public SocketServerThread(Socket client){
        this.client = client;
    }

    @Override
    public void run(){
        try{
            PrintStream out = new PrintStream(client.getOutputStream());
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag = true;
            System.out.println("start a new thread ok!");
            while (flag){
//                System.out.println("Going to read stream from client");
                String str = buf.readLine();
                System.out.println("client say:" + str);
                if(str == null || "".equals(str)){
                    flag = false;
                }else {
                    if("bye".equals(str)){
                        flag = false;
                    }else {
                        out.println("echo:" + str);
                    }
                }
            }
            out.close();
            client.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
