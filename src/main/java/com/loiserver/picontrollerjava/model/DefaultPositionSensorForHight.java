package com.loiserver.picontrollerjava.model;

        import com.pi4j.io.gpio.*;
        import com.pi4j.io.gpio.event.GpioPinDigitalStateChangeEvent;
        import com.pi4j.io.gpio.event.GpioPinListenerDigital;
        import org.springframework.stereotype.Component;

@Component
public class DefaultPositionSensorForHight implements ReadPortsState {
    private GpioController gpio;
    private GpioPinDigitalInput defaultPositionSensorDetect;
    private boolean defaultPositionSensorForHightState = false;

    public DefaultPositionSensorForHight(){
        gpio = GpioFactory.getInstance();
        defaultPositionSensorDetect = gpio.provisionDigitalInputPin(RaspiPin.GPIO_28, PinPullResistance.PULL_UP);
        defaultPositionSensorDetect.setShutdownOptions(true);

        defaultPositionSensorDetect.addListener(new GpioPinListenerDigital() {
            @Override
            public void handleGpioPinDigitalStateChangeEvent(GpioPinDigitalStateChangeEvent event) {
                if(defaultPositionSensorForHightState){
                    System.out.println("out the default position for height!");
                    defaultPositionSensorForHightState = !defaultPositionSensorForHightState;;

                }
                else {
                    System.out.println("in the default position for height!");
                    defaultPositionSensorForHightState = !defaultPositionSensorForHightState;;

                }



            }
        });
    }

    public boolean getStat(){
        return defaultPositionSensorForHightState;
    }
}
