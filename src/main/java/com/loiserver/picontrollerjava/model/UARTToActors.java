package com.loiserver.picontrollerjava.model;

import com.pi4j.io.serial.SerialFactory;

import java.io.IOException;

public interface UARTToActors {
    void sendToGasSupplier(String messageWillsent) throws IOException;
    String getReceivedFromGasSupplierString();
//    int getI();

}


