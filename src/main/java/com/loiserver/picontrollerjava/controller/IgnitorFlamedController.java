package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.IgnitorFlamed;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IgnitorFlamedController {
    private IgnitorFlamed ignitorFlamed;

    @RequestMapping("/ignitorFlamed")
    public String ignitorState(){

        if(ignitorFlamed == null){
            ignitorFlamed = new IgnitorFlamed();
        }
        boolean ignitorFalamedState = ignitorFlamed.getIgnitorFlameState();

        return "ignitor Flamed!" + "--->" + ignitorFalamedState;

    }


}
