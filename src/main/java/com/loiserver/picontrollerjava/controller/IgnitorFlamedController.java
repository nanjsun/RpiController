package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.IgnitorFlameSensor;
import com.loiserver.picontrollerjava.model.socketServer.SocketServerOnPi;
import com.loiserver.picontrollerjava.model.operatingData.OperatingData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class IgnitorFlamedController implements ReadPortsStateController {
    @Autowired
    private IgnitorFlameSensor ignitorFlameSensor;

    @Autowired
    private OperatingData operatingData;

    @Autowired
    private SocketServerOnPi socketServerOnPi;

    @RequestMapping("/ignitorFlamed")
    public String ignitorState() throws Exception {

        boolean ignitorFalamedState = ignitorFlameSensor.getStat();

        int igniortFlameLength = operatingData.getIgnitorFlameLength();

        return "ignitor Flamed!" + "--->" + ignitorFalamedState + "\n ignitorFlameLength = " + igniortFlameLength;

    }
}
