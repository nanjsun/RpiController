package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.wiringpi.Gpio.*;

public class MotorForHight{
    private GpioController gpio;
    private Pin pin;
    private GpioPinPwmOutput pwm;

    public MotorForHight(){
        pin = CommandArgumentParser.getPin(
                RaspiPin.class,
                RaspiPin.GPIO_01);

        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }

        pwm = gpio.provisionPwmOutputPin(pin);
        com.pi4j.wiringpi.Gpio.pwmSetMode(com.pi4j.wiringpi.Gpio.PWM_MODE_MS);
//        frequency of PWM = 19.2MHZ/pwmsetRange()/pwmsetClock(),
//        in this case ,f = 19200000/1000/500 = 38.4Hz
        com.pi4j.wiringpi.Gpio.pwmSetRange(5000);
        com.pi4j.wiringpi.Gpio.pwmSetClock(5000);


    }

    public void pwnOutput(int pwnValue, String[] args){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }

//        set the duty cycle , in this case duty cycle = 500 /1000 = 0.5
        pwm.setPwm(pwnValue);

    }
    public void pwmShotduwn(){
        if (gpio != null){
            gpio.shutdown();
        }

    }
}
