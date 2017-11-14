package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalOutput;
import com.pi4j.io.gpio.PinState;
import com.pi4j.io.gpio.RaspiPin;

public class LedModle {

    private final GpioController gpio = GpioFactory.getInstance();
    public LedModle(){
        gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, PinState.LOW);
    }

//    public void onLed(){
//        gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.HIGH);
//
//        };

//    public void offLed(){
//
//        gpio.provisionDigitalOutputPin(RaspiPin.GPIO_01, "MyLED", PinState.LOW);
//
//    }


    public GpioController getGpio() {
        return gpio;
    }
}
