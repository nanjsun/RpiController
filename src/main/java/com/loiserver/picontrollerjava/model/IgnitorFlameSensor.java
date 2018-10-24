package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import org.springframework.stereotype.Component;

@Component
public class IgnitorFlameSensor implements ReadPortsState {
    private GpioController gpio;
    private GpioPinDigitalInput ignitorFlameDetect;
    private boolean ignitorFlameState = false;

    public IgnitorFlameSensor() {
        gpio = GpioFactory.getInstance();
        ignitorFlameDetect = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, PinPullResistance.PULL_UP);
        ignitorFlameDetect.setShutdownOptions(true);

        ignitorFlameDetect.addListener(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                if (ignitorFlameState) {
                    System.out.println("button is released!");
                    ignitorFlameState = !ignitorFlameState;
                    ;

                }
                if (!ignitorFlameState) {
                    System.out.println("button is pressed!");
                    ignitorFlameState = !ignitorFlameState;
                    ;

                }


            }
        });
    }

    public boolean getStat() {
        return ignitorFlameState;
    }
}
