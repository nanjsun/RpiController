package com.loiserver.picontrollerjava.model;

public interface Motors {
    void pwnOutput(int pwnValue);
    void pwmShotduwn();
    void motorSetEnable();
    void motorSetDisable();
    void motorSetCw();
    void motorSetCCw();
}
