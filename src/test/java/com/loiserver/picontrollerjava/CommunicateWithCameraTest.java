package com.loiserver.picontrollerjava;

import com.loiserver.picontrollerjava.model.communicationWithCamera.CommunicateWithCamera;
import org.junit.Test;

public class CommunicateWithCameraTest {
    @Test
    public void communicateTest(){
        CommunicateWithCamera communicateWithCamera = new CommunicateWithCamera();
        communicateWithCamera.setInformation();
    }
}
