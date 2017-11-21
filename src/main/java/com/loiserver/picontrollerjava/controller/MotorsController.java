package com.loiserver.picontrollerjava.controller;

public interface MotorsController {
    String runMotor(int pwmValue);
    String stopMotor();
}
