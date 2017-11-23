package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.IgnitorFlameSensor;
import com.loiserver.picontrollerjava.model.ReadPortsState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class IgnitorFlamedController implements ReadPortsStateController{
    @Autowired
    private IgnitorFlameSensor ignitorFlameSensor;

    @RequestMapping("/ignitorFlamed")
    public String ignitorState(){

//        if(ignitorFlamed == null){
//            ignitorFlamed = new IgnitorFlameSensor();
//        }
        boolean ignitorFalamedState = ignitorFlameSensor.getStat();

        return "ignitor Flamed!" + "--->" + ignitorFalamedState;

    }


}
