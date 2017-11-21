package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.IgnitorFlamed;
import com.loiserver.picontrollerjava.model.ReadPortsState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class IgnitorFlamedController implements ReadPortsStateController{
    @Autowired
    private ReadPortsState readPortsState;

    @RequestMapping("/ignitorFlamed")
    public String ignitorState(){

//        if(ignitorFlamed == null){
//            ignitorFlamed = new IgnitorFlamed();
//        }
        boolean ignitorFalamedState = readPortsState.getStat();

        return "ignitor Flamed!" + "--->" + ignitorFalamedState;

    }


}
