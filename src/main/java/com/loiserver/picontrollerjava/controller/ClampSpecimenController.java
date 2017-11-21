package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.WritePortsState;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class ClampSpecimenController implements WritePortsStateController {
    @Autowired
    private WritePortsState writePortsState;

    @RequestMapping("/clampSpecimenOn")
    public void setState(){
        writePortsState.setStat();
    }

    @RequestMapping("/clampSpecimenOff")
    public void unSetState(){
        writePortsState.unSetState();
    }
}
