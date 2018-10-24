
package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Component;

@Component
public class IgnitorFlame implements WritePortsState {
    private GpioController gpio;
    private GpioPinDigitalOutput pin;

    public IgnitorFlame() {
        gpio = GpioFactory.getInstance();
        pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_06, "flame ignitor", PinState.LOW);
//        pin.setShutdownOptions(true, PinState.LOW);
    }

    public void setStat() {

        pin.high();
    }

    public void unSetState() {

        pin.low();

    }
}
