package com.loiserver.picontrollerjava.controller;

import com.loiserver.picontrollerjava.model.IgnitorFlameSensor;
import com.loiserver.picontrollerjava.model.operatingData.OperatingData;
import com.loiserver.picontrollerjava.model.socketServer.SocketServerOnPi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class StartSocketServer implements ReadPortsStateController{
    @Autowired
    private IgnitorFlameSensor ignitorFlameSensor;

    @Autowired
    private OperatingData operatingData;

    @Autowired
    private SocketServerOnPi socketServerOnPi;

    private boolean socketStart = false;

    @RequestMapping("/startSocket")
    public String ignitorState() throws Exception{

//        if(ignitorFlamed == null){
//            ignitorFlamed = new IgnitorFlameSensor();
//        }
        boolean ignitorFalamedState = ignitorFlameSensor.getStat();

        int igniortFlameLength = operatingData.getIgnitorFlameLength();
        if(!socketStart){
            try{
                socketServerOnPi.listen();
                socketStart = true;
            } catch (Exception e){
                e.printStackTrace();
            }
        }

        return "ignitor Flamed!" + "--->" + ignitorFalamedState + "\n ignitorFlameLength = " + igniortFlameLength;

    }


}
