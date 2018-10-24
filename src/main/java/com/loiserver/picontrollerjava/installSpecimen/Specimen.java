package com.loiserver.picontrollerjava.installSpecimen;

import com.loiserver.picontrollerjava.model.InitMotors;
import com.loiserver.picontrollerjava.model.MotorForAngle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Specimen implements Specimens {
    private int length;
    private int positionCode;
    private boolean installState;
    private boolean flamed;

    @Autowired
    private InitMotors initMotors;

    @Autowired
    private MotorForAngle motorForAngle;

    public void install() {
        initMotors.init();
//        we got an rotator with ratio of 90:1.
        int rotateAngle = 45 + positionCode * 10 * 90;

        motorForAngle.pwmSetDuty(100);


    }

    public void uninstall() {

    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return this.length;
    }

    public void setPositionCode(int positionCode) {
        this.positionCode = positionCode;
    }


}
