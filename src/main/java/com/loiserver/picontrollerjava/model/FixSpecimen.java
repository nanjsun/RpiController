package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import org.springframework.stereotype.Component;

@Component
public class FixSpecimen implements WritePortsState {
    private GpioController gpio;
    private GpioPinDigitalOutput pin;

    public FixSpecimen(){
        gpio = GpioFactory.getInstance();
        pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_27, "fix Specimen", PinState.LOW);
//        pin.setShutdownOptions(true, PinState.LOW);
    }

    public void setStat(){
//        if(gpio == null){
//            gpio = GpioFactory.getInstance();
//            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26, "clampSpecimen", PinState.LOW);
//            pin.setShutdownOptions(true, PinState.LOW);
//        }
        pin.high();
    }

    public void unSetState(){
//        if(gpio == null){
//            gpio = GpioFactory.getInstance();
//            pin = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_26, "clampSpecimen", PinState.LOW);
//            pin.setShutdownOptions(true, PinState.LOW);
//        }
        pin.low();

    }
}
