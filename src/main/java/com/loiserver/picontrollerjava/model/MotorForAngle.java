package com.loiserver.picontrollerjava.model;

import com.pi4j.io.gpio.*;
import com.pi4j.util.CommandArgumentParser;
import com.pi4j.wiringpi.Gpio;
import org.springframework.stereotype.Component;

@Component
public class MotorForAngle implements Motors{
    private GpioController gpio;
    private Pin pin;
    private GpioPinPwmOutput pwm;
    private GpioPinDigitalOutput motorEnable;
    private GpioPinDigitalOutput motorDirection;

    public MotorForAngle(){
        pin = CommandArgumentParser.getPin(
                RaspiPin.class,
                RaspiPin.GPIO_23);

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

    public void pwnOutput(int pwnValue){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }

//        set the duty cycle , in this case duty cycle = 500 /1000 = 0.5
        pwm.setPwm(pwnValue);

    }
    public void pwmShotduwn(){
        if (gpio != null){
//            gpio.shutdown();
        }
        pwm.setPwm(0);

    }
    public void motorSetEnable(){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }
        if(motorEnable == null){

            motorEnable = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24, "enable angle motor", PinState.LOW);
        }

        motorEnable.high();
    }
    public void motorSetDisable(){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }
        if(motorEnable == null){

            motorEnable = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_24, "enable angle motor", PinState.LOW);
        }
        motorEnable.low();
    }

    public void motorSetCw(){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }
        if(motorDirection == null){

            motorDirection = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25, "enable angle motor", PinState.LOW);
        }
        motorDirection.high();
    }

    public void motorSetCCw(){
        if(gpio == null){
            gpio = GpioFactory.getInstance();
        }
        if(motorDirection == null){

            motorDirection = gpio.provisionDigitalOutputPin(RaspiPin.GPIO_25, "enable angle motor", PinState.LOW);
        }
        motorDirection.low();
    }




}
