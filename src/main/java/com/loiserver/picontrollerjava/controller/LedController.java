package com.loiserver.picontrollerjava.controller;

//import com.pi4j.*

import com.loiserver.picontrollerjava.model.LedModle;
import com.pi4j.io.gpio.*;
import com.pi4j.wiringpi.Gpio;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LedController {

    private static GpioPinDigitalOutput pin;

    @RequestMapping("/on")
    public String light(){
        if(pin == null){
            GpioController gpio = GpioFactory.getInstance();
            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29, "Myled", PinState.LOW);
        }

        pin.high();
        return "on";
    }

    @RequestMapping("/off")
    public String off(){
        if(pin == null){
            GpioController gpio = GpioFactory.getInstance();
            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_29, "myled", PinState.LOW);
        }

        pin.low();

        return "off";
    }
}
