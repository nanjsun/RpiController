package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
import com.pi4j.io.gpio.event.GpioPinListenerDigital;
import org.springframework.stereotype.Component;

@Component
public class DefaultPositionSensorForAngle implements ReadPortsState {
    private GpioController gpio;
    private GpioPinDigitalInput defaultPositionSensorForAngleDetect;
    private boolean defaultPositionSensorForAngleState = false;

    public DefaultPositionSensorForAngle() {
        gpio = GpioFactory.getInstance();
        defaultPositionSensorForAngleDetect = gpio.provisionDigitalInputPin(RaspiPin.GPIO_29, PinPullResistance.PULL_UP);
        defaultPositionSensorForAngleDetect.setShutdownOptions(true);

        defaultPositionSensorForAngleDetect.addListener(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                if (defaultPositionSensorForAngleState) {
                    System.out.println("out the default position for height!");
                    defaultPositionSensorForAngleState = !defaultPositionSensorForAngleState;
                    ;

                } else {
                    System.out.println("in the default position for height!");
                    defaultPositionSensorForAngleState = !defaultPositionSensorForAngleState;
                    ;

                }


            }
        });
    }

    public boolean getStat() {
        return defaultPositionSensorForAngleState;
    }
}
