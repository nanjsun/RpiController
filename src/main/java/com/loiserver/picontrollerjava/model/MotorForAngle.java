package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import org.springframework.stereotype.Component;

@Component
public class MotorForAngle implements Motors {
    private GpioController gpio;
    private Pin pwmPin;
    private GpioPinPwmOutput pwm;
    private GpioPinDigitalOutput motorEnable;
    private GpioPinDigitalOutput motorDirection;
    private int pwmRange = 4096;
    private final Pin pwmPinNum = RaspiPin.GPIO_23;
    private final Pin motorEnablePinNum = RaspiPin.GPIO_24;
    private final Pin motorDirectionNum = RaspiPin.GPIO_25;


    public MotorForAngle() {
        pwmPin = CommandArgumentParser.getPin(
                RaspiPin.class,
                pwmPinNum);
        if (gpio == null) {
            gpio = GpioFactory.getInstance();
        }

        motorEnable = gpio.provisionDigitalOutputPin(motorEnablePinNum, "enable motor", PinState.LOW);
        motorDirection = gpio.provisionDigitalOutputPin(motorDirectionNum, "set direction of motor", PinState.LOW);
        pwm = gpio.provisionPwmOutputPin(pwmPin);
        com.pi4j.wiringpi.Gpio.pwmSetMode(com.pi4j.wiringpi.Gpio.PWM_MODE_MS);
//        frequency of PWM = 19.2MHZ/pwmsetRange()/pwmsetClock(),
        com.pi4j.wiringpi.Gpio.pwmSetRange(pwmRange);
    }

    public void pwmSetFrequence(float frequence) {
        int pwmClock = (int) (19200000 / pwmRange / frequence);
        com.pi4j.wiringpi.Gpio.pwmSetClock(pwmClock);
        System.out.println("pwmClock--:" + pwmClock);
    }

    public void pwmSetDuty(float pwmDuty) {
        int pwnValue = (int) (pwmDuty * pwmRange);
        pwm.setPwm((int) (pwmDuty * pwmRange));
        System.out.println("pwmValue--:" + pwnValue);
    }

    public void pwmShutdown() {
        pwm.setPwm(0);
    }

    public void motorSetEnable() {
        motorEnable.high();
    }

    public void motorSetDisable() {
        motorEnable.low();
    }

    public void motorSetCw() {
        motorDirection.high();
    }

    public void motorSetCCw() {
        motorDirection.low();
    }
}
