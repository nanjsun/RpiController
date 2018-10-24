package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.UARTToActors;
import com.loiserver.picontrollerjava.model.UARTToGasSupplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
@Component
public class UARTToGasSupplierController implements UARTToActorsController {

    private UARTToActors uartToActors;

    @Autowired(required = false)
    public UARTToGasSupplierController(UARTToActors uartToActors) {
        this.uartToActors = uartToActors;
    }

    @RequestMapping("/uartsend")
    public String sendMessage(@RequestParam("messageSendToGasSupplier") String messageSendToGasSupplier) throws IOException, NullPointerException, InterruptedException {

        uartToActors.sendToGasSupplier(messageSendToGasSupplier);
        return "see that?";

    }

    @RequestMapping("/uartreceive")
    public String recceiveMessage() throws InterruptedException, IOException {
        uartToActors.getReceivedFromGasSupplierString();
        String message = uartToActors.getReceivedFromGasSupplierString();
        System.out.println("---> got this message ?");
        return message;
    }
}
