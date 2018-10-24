package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.MotorForAngle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class MotorForAngleController implements MotorsController {

    @Autowired
    private MotorForAngle motorForAngle;


    @RequestMapping(value = "/pwm2on")
    public String runMotor(@RequestParam("pwmDuty") float pwmDuty, @RequestParam("pwmFrequency") float pwmFrequency,
                           @RequestParam("motorEnable") int motorEnable, @RequestParam("clockWise") int clockWise) {

        String[] inputValueError = {"", "Wrong pwmDuty value, and automatic set to 1",
                "", "Wrong pwmFrequency, and automatioc set to lowest value 1.145",
                "motorEnable", "motorDisable",
                "clockWise", "antiClockWise"};

        int[] errorIndex = {0, 2, 4, 6};
        if (pwmDuty > 1) {
            pwmDuty = 1;
            errorIndex[0] = 1;
            System.out.println(inputValueError[1]);

        }

        if (pwmFrequency < 1.145) {
            pwmFrequency = 1.145f;
            errorIndex[1] = 3;
            System.out.println("Wrong pwmFrequency, and automatioc set to lowest value 1.145");

        }

        if (motorEnable == 0) {
            motorForAngle.motorSetDisable();
            System.out.println("set motorSetDisable");
        } else {
            motorForAngle.motorSetEnable();
            System.out.println("set motorSetEnable");
        }

        if (clockWise == 0) {
            motorForAngle.motorSetCCw();
            System.out.println("set motorCCW");
        } else {
            motorForAngle.motorSetCw();
            System.out.println("set motorCW");
        }

        motorForAngle.pwmSetFrequence(pwmFrequency);
        System.out.println("pwmFrequency--:" + pwmFrequency);
        motorForAngle.pwmSetDuty(pwmDuty);
        System.out.println("pwmDuty--:" + pwmDuty);

        return "running" + "\n" + "pwmFrequency--:" + pwmFrequency +
                "pwmDuty--:" + pwmDuty + "---->" + inputValueError[errorIndex[0]] + inputValueError[errorIndex[1]];
    }

    @RequestMapping(value = "/pwm2off")
    public String stopMotor() {
        if (motorForAngle != null) {
            motorForAngle.pwmShutdown();
            motorForAngle.motorSetCCw();
            motorForAngle.motorSetDisable();
        }
        return "stop!";
    }
}
