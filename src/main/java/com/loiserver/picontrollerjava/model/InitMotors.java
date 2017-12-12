package com.loiserver.picontrollerjava.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InitMotors implements Init {
    @Autowired
    private MotorForHight motorForHight;

    @Autowired
    private MotorForAngle motorForAngle;

    @Autowired
    private DefaultPositionSensorForAngle defaultPositionSensorForAngle;

    @Autowired
    private DefaultPositionSensorForHight defaultPositionSensorForHight;



    public void init(){

        motorForHight.motorSetEnable();;
        motorForHight.motorSetCw();
        motorForHight.pwmSetDuty(2000);
        while(defaultPositionSensorForHight.getStat() == false){
            System.out.println("initing motor for hight, please waiting!");
        }
        motorForHight.pwmShutdown();
        System.out.println("motor for hight inited!");

        motorForAngle.motorSetEnable();
        motorForAngle.motorSetCw();
        motorForAngle.pwmSetDuty(2000);
        while (defaultPositionSensorForAngle.getStat() == false){
            System.out.println("initing motor for angle, please waiting!");
        }
        motorForAngle.pwmShutdown();
        System.out.println("motor for angle inited!");

    }
}
