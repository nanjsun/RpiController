package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.UARTToActors;
import com.loiserver.picontrollerjava.model.UARTToGasSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController

public class UARTToGasSupplierController implements UARTToActorsController{
//public class UARTToGasSupplierController{

    private UARTToGasSupplier uartToGasSupplier;

//    @Autowired
//    public UARTToGasSupplierController(UARTToActors uartToGasSupplier){
//        this.uartToGasSupplier = uartToGasSupplier;
//    }

    @RequestMapping("/uartsend")
    public String sendMessage() throws IOException, NullPointerException, InterruptedException{
        uartToGasSupplier = new UARTToGasSupplier();
        System.out.println("access to /uar2222tsend");
        if(uartToGasSupplier == null || true){
            System.out.println("----->0");
            uartToGasSupplier = new UARTToGasSupplier();
            System.out.println("----->1");
        }
        System.out.println("----->2");
        try {
            System.out.println("----->3");
            System.out.println("---->" + uartToGasSupplier.getI());
            uartToGasSupplier.sendToGasSupplier("seeee");
            System.out.println("----->4");
        }
        catch (IOException e){
            System.out.println("---> " + e);
        }
        catch (NullPointerException e){
            System.out.println("--->" + e);
        }

        return "seee that ?";
    }

    @RequestMapping("/uartreceive")
    public String recceiveMessage() throws InterruptedException, IOException{
        if(uartToGasSupplier == null){
            System.out.println("----> renew the uartToGasSupplier instance");
            uartToGasSupplier = new UARTToGasSupplier();
        }
//        try {
//            String message = uartToGasSupplier.getReceivedFromGasSupplierString();
//        }
//        catch ( e){
//            System.out.println("--->" + e);
//        }
        String message = uartToGasSupplier.getReceivedFromGasSupplierString().toString();
        System.out.println("---> got this message ?");
        return message;

    }
}
