package com.loiserver.picontrollerjava.model.socketServer;

import com.alibaba.fastjson.JSON;
import com.loiserver.picontrollerjava.model.communicationWithCamera.InformationFromOpencvToPi;
import com.loiserver.picontrollerjava.model.operatingData.OperatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

//@Component

public class SocketServerThread implements Runnable {

    private Socket client = null;
    private InformationFromOpencvToPi informationFromOpencvToPi;

    //    @Autowired
    private OperatingData operatingData;

    public SocketServerThread(Socket client, OperatingData operatingData) {
        this.client = client;
        this.operatingData = operatingData;
    }

    @Override
    public void run() {
        try {
            PrintStream out = new PrintStream(client.getOutputStream());
            BufferedReader buf = new BufferedReader(new InputStreamReader(client.getInputStream()));
            boolean flag = true;
            System.out.println("start a new thread ok!");
            int count = 0;
            while (flag) {
                count++;
                if (count > 2) {
                    break;
                }
//                System.out.println("Going to read stream from client");
                String str = buf.readLine();
                System.out.println("client1 say:" + str);
//                System.out.println("client say:" + str.substring(0,1));
                if (str.substring(0, 1).equals("{")) {
                    try {
//                        System.out.println("success!");
                        informationFromOpencvToPi =
                                JSON.parseObject(str, InformationFromOpencvToPi.class);
//                        System.out.println(informationFromOpencvToPi.getCommand());
                        switch (informationFromOpencvToPi.getCommand()) {
                            case "try":
                                out.println("try success");
                                System.out.println("Try succes  ");
                                break;

                            case "ignitorFlameLength":
                                System.out.println("igniorFlameLength = " + informationFromOpencvToPi.getIgnitorFlameLength());
                                operatingData.setIgnitorFlameLength(informationFromOpencvToPi.getIgnitorFlameLength());
                                break;

                            case "specimenFlameLength":
                                System.out.println("specimenFalmeLength= " + informationFromOpencvToPi.getSpecimenFlameLength());
                                break;

                            case "specimenLength":
                                System.out.println("spcimenLenght =" + informationFromOpencvToPi.getSpecimenLength());
                                break;

                            default:
                                System.out.println("wrong command!");
                                break;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                        System.out.println("can not parased this String");
                        System.out.println("client say:" + str);
                    }
                }

//                out.println("-->" + str);

//                System.out.println("client say:" + str);
                if (str == null || "".equals(str)) {
                    flag = false;
                } else {
                    if ("bye".equals(str)) {
                        flag = false;
                    } else {
                        out.println("echo:" + str);
                    }
                }
            }
            out.close();
            client.close();
        } catch (Exception e) {
            System.out.println("new a thread failed!");
            e.printStackTrace();
        }
    }
}
