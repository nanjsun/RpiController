package com.loiserver.picontrollerjava.controller;

import java.io.IOException;

public interface UARTToActorsController {
    String sendMessage(String messageSendToActor) throws IOException, InterruptedException;
    String recceiveMessage() throws InterruptedException, IOException;
}
