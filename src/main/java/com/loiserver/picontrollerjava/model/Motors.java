package com.loiserver.picontrollerjava.model;

public interface Motors {
    void pwmSetDuty(float pwmDuty);
    void pwmShutdown();
    void motorSetEnable();
    void motorSetDisable();
    void motorSetCw();
    void motorSetCCw();
    void pwmSetFrequence(float frequence);
}
