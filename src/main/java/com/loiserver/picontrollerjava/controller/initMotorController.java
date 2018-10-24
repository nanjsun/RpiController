package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.InitMotors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class initMotorController {
    @Autowired
    private InitMotors initMotors;

    @RequestMapping("/initMotors")
    public String init() {
        initMotors.init();
        return "init motor done!";
    }

}
