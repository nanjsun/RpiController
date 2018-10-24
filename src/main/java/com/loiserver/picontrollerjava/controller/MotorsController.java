package com.loiserver.picontrollerjava.controller;

public interface MotorsController {
    String runMotor(float duty, float pwmFrequence, int enable, int clockWise);

    String stopMotor();
}
