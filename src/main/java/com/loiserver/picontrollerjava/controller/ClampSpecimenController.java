package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.ClampSpecimen;
import com.loiserver.picontrollerjava.model.WritePortsState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ClampSpecimenController implements WritePortsStateController {
    @Autowired
    private ClampSpecimen clampSpecimen;

    @RequestMapping("/clampSpecimenOn")
    public String setState(){
        clampSpecimen.setStat();
        System.out.println("clampSpecimen on!");
        return "clampSpecimen on!";
    }

    @RequestMapping("/clampSpecimenOff")
    public String unSetState(){
        clampSpecimen.unSetState();
        System.out.println("clampSpecimen off!");
        return "clampSpecimen off!";
    }
}
