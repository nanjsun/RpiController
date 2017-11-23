package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.MotorForAngle;
import com.loiserver.picontrollerjava.model.MotorForHight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class MotorForAngleController implements MotorsController{

    @Autowired
    private MotorForAngle motorForAngle;


    @RequestMapping(value = "/pwm2on")
    public String runMotor(@RequestParam("pwmValue") int pwmValue){

        String pwnValue;
        String[] args = {"500", "999"};
//        if(motorForHight == null){
//            motorForHight = new MotorForHight();
//        }

        motorForAngle.pwnOutput(pwmValue);
        motorForAngle.motorSetCw();
        motorForAngle.motorSetEnable();


        return "running";
    }

    @RequestMapping(value = "/pwm2off")
    public String stopMotor(){
        if(motorForAngle != null){
            motorForAngle.pwmShotduwn();
            motorForAngle.motorSetCCw();
            motorForAngle.motorSetDisable();
        }
        return "stop!";
    }
}
