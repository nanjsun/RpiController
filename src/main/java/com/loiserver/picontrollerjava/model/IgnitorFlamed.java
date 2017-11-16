package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;

public class IgnitorFlamed {
    private GpioController gpio;
    private GpioPinDigitalInput ignitorFlameDetect;
    private boolean ignitorFlameState = false;

    public IgnitorFlamed(){
        gpio = GpioFactory.getInstance();
        ignitorFlameDetect = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_UP);
        ignitorFlameDetect.setShutdownOptions(true);

        ignitorFlameDetect.addListener(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                System.out.println("button is pressed!");
                ignitorFlameState = true;
            }
        });
    }

    public boolean getIgnitorFlameState(){
        return ignitorFlameState;
    }
}
