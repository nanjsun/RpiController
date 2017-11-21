package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.MotorForHight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class MotorForHightController implements MotorsController{

    @Autowired
    private MotorForHight motorForHight;


    @RequestMapping(value = "/pwmon")
    public String runMotor(@RequestParam("pwmValue") int pwmValue){

        String pwnValue;
        String[] args = {"500", "999"};
//        if(motorForHight == null){
//            motorForHight = new MotorForHight();
//        }

        motorForHight.pwnOutput(pwmValue, args);
        motorForHight.motorSetCw();
        motorForHight.motorSetEnable();


        return "running";
    }

    @RequestMapping(value = "/pwmoff")
    public String stopMotor(){
        if(motorForHight != null){
            motorForHight.pwmShotduwn();
            motorForHight.motorSetCCw();
            motorForHight.motorSetDisable();
        }
        return "stop!";
    }
}
