package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.UARTToActors;
import com.loiserver.picontrollerjava.model.UARTToGasSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Component
public class UARTToGasSupplierController implements UARTToActorsController{
//public class UARTToGasSupplierController{

    private UARTToActors uartToActors;

    @Autowired(required = false)
    public UARTToGasSupplierController(UARTToActors uartToActors){
        this.uartToActors = uartToActors;
    }

    @RequestMapping("/uartsend")
    public String sendMessage() throws IOException, NullPointerException, InterruptedException{
        uartToActors.sendToGasSupplier("see me ?");
        return "see that?";
//        uartToActors = new UARTToGasSupplier();
//        System.out.println("access to /uar2222tsend");
//        if(uartToActors == null || true){
//            System.out.println("----->0");
//            uartToActors = new UARTToGasSupplier();
//            System.out.println("----->1");
//        }
//        System.out.println("----->2");
//        try {
//            System.out.println("----->3");
////            System.out.println("---->" + uartToGasSupplier.getI());
//            uartToActors.sendToGasSupplier("seeee");
//            System.out.println("----->4");
//        }
//        catch (IOException e){
//            System.out.println("---> " + e);
//        }
//        catch (NullPointerException e){
//            System.out.println("--->" + e);
//        }
//
//        return "seee that ?";
    }

    @RequestMapping("/uartreceive")
    public String recceiveMessage() throws InterruptedException, IOException{
        uartToActors.getReceivedFromGasSupplierString();
//        return "received !";
//        if(uartToActors == null){
//            System.out.println("----> renew the uartToGasSupplier instance");
//            uartToActors = new UARTToGasSupplier();
//        }
//        try {
//            String message = uartToGasSupplier.getReceivedFromGasSupplierString();
//        }
//        catch ( e){
//            System.out.println("--->" + e);
//        }
        String message = uartToActors.getReceivedFromGasSupplierString();
        System.out.println("---> got this message ?");
        return message;

    }
}
