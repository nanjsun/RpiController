package com.loiserver.picontrollerjava.model;

public interface Motors {
    void pwnOutput(int pwnValue, String[] args);
    void pwmShotduwn();
    void motorSetEnable();
    void motorSetDisable();
    void motorSetCw();
    void motorSetCCw();
}
