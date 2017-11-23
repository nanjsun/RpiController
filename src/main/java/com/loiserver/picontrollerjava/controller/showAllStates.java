package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.DefaultPositionSensorForAngle;
import com.loiserver.picontrollerjava.model.DefaultPositionSensorForHight;
import com.loiserver.picontrollerjava.model.IgnitorFlameSensor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class showAllStates {
    @Autowired
    private DefaultPositionSensorForHight defaultPositionSensorForHight;

    @Autowired
    private DefaultPositionSensorForAngle defaultPositionSensorForAngle;

    @Autowired
    private IgnitorFlameSensor ignitorFlameSensor;

    @RequestMapping("/showAll")
    public String getAllStates(){
        return "defaultHightSensor:" + defaultPositionSensorForHight.getStat() + "\\" + "defaultAngleSensor:" + defaultPositionSensorForAngle.getStat() +
        "ignitorFlameSensor" + ignitorFlameSensor.getStat();
    }
}
