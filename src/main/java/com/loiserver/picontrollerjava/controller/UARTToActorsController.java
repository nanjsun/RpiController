package com.loiserver.picontrollerjava.controller;

import java.io.IOException;

public interface UARTToActorsController {
    String sendMessage() throws IOException, InterruptedException;
    String recceiveMessage() throws InterruptedException, IOException;
}
