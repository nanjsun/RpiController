package com.loiserver.picontrollerjava.model;

import com.pi4j.io.serial.Serial;

import com.pi4j.io.serial.*;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialDataEventListener;
import com.pi4j.io.serial.SerialFactory;
import com.pi4j.io.serial.impl.SerialImpl;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;

//@Service
public class UARTToGasSupplier implements UARTToActors{
    private Serial serial;
    private ArrayList receivedFromGasSupplier = new ArrayList();
    private SerialConfig config;
    private int i;

    public UARTToGasSupplier() throws IOException, InterruptedException{
        i = 10086;
        System.out.println("serial init begain!");
//        receivedFromGasSupplier = new ArrayList();
        System.out.println("receivedFromGasSupplier init completed!");
        serial = SerialFactory.createInstance();


        serial.addListener(new SerialDataEventListener() {
            @Override
            public void dataReceived(SerialDataEvent event) {

                try {

//                  add received code to the receivedFromGasSupplier
                    System.out.println("---> receving data from uart");
                    final String receivedString = event.getAsciiString();
//                    receivedFromGasSupplier.add(event.getAsciiString());
                    receivedFromGasSupplier.add(receivedString);
                    System.out.println("-> receive data from uart done:" + receivedString);
                    System.out.println("-> all data from uart done:" + receivedFromGasSupplier.toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });

        try{
            config = new SerialConfig();

            config.device(SerialPort.getDefaultPort())
                    .baud(Baud._38400)
                    .dataBits(DataBits._8)
                    .parity(Parity.NONE)
                    .stopBits(StopBits._1)
                    .flowControl(FlowControl.NONE);

            serial.open(config);

            System.out.println("serial open!");

        }
        catch (InterruptedException e){
            System.out.println(e);
        }

        System.out.println("serial init completed!");

    }

    @Override
    public void sendToGasSupplier(String messageWillsent) throws IOException{
        if(serial == null){
            serial = SerialFactory.createInstance();

        }
        if(serial.isOpen() == false){
            serial.open(config);
        }
//        serial.
        try{
            serial.write(messageWillsent);
            System.out.println("send message!");
        }
        catch (IOException e){
            System.out.println("write to serial faild!" + e);
        }
    }

    @Override
    public String getReceivedFromGasSupplierString(){
        return receivedFromGasSupplier.toString();
    }

    public int getI(){
        System.out.println("i = " + i);
        return i;

    }
}

