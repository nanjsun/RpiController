package com.loiserver.picontrollerjava.model.communicationWithCamera;

/***********************************************************************
 * Module:  InformationFromOpencvToPi.java
 * Author:  nanj
 * Purpose: Defines the Class InformationFromOpencvToPi
 ***********************************************************************/

/**
 * @pdOid 7097a0d0-1448-4a64-89da-265838286da2
 */
public class InformationFromOpencvToPi {
    private String command;
    private int direction;
    private boolean cameraOK;
    private boolean ignitorFlamed;
    private int ignitorFlameLength;
    private int specimenLength;
    private int firstDistanceBetweenSpecimenAndIgnitor;
    private int secondDistanceBetweenSpecimenAndIgnitor;
    private boolean specimenFlamed;
    private int specimenFlameLength;
    private int specimenBurnoffLength;
    private int specimenBurnTime;

    public String getCommand() {
        return command;
    }

    public void setCommand(String newFunction) {
        command = newFunction;
    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(int newDirection) {
        direction = newDirection;
    }

    public boolean getCameraOK() {
        return cameraOK;
    }

    public void setCameraOK(boolean newCameraOK) {
        cameraOK = newCameraOK;
    }

    public boolean getIgnitorFlamed() {
        return ignitorFlamed;
    }

    public void setIgnitorFlamed(boolean newIgnitorFlamed) {
        ignitorFlamed = newIgnitorFlamed;
    }

    public int getIgnitorFlameLength() {
        return ignitorFlameLength;
    }

    /**
     * @param newIgnitorFlameLength
     * @pdOid 96221486-2058-42ee-97c5-e01754a79554
     */
    public void setIgnitorFlameLength(int newIgnitorFlameLength) {
        ignitorFlameLength = newIgnitorFlameLength;
    }

    /**
     * @pdOid 59ea9232-c460-4ab7-a979-8aba45c4d15a
     */
    public int getSpecimenLength() {
        return specimenLength;
    }

    /**
     * @param newSpecimenLength
     * @pdOid 78896691-c702-473e-af6e-465e2e9d5a43
     */
    public void setSpecimenLength(int newSpecimenLength) {
        specimenLength = newSpecimenLength;
    }

    /**
     * @pdOid 15f76292-0a9d-4fa9-8750-32e5a4a635a9
     */
    public int getFirstDistanceBetweenSpecimenAndIgnitor() {
        return firstDistanceBetweenSpecimenAndIgnitor;
    }

    /**
     * @param newFirstDistanceBetweenSpecimenAndIgnitor
     * @pdOid 21b50313-a2b8-4796-b1dc-a479e56d1163
     */
    public void setFirstDistanceBetweenSpecimenAndIgnitor(int newFirstDistanceBetweenSpecimenAndIgnitor) {
        firstDistanceBetweenSpecimenAndIgnitor = newFirstDistanceBetweenSpecimenAndIgnitor;
    }

    /**
     * @pdOid 646e5ce3-3614-4fe0-984f-53bb318e48b7
     */
    public int getSecondDistanceBetweenSpecimenAndIgnitor() {
        return secondDistanceBetweenSpecimenAndIgnitor;
    }

    /**
     * @param newSecondDistanceBetweenSpecimenAndIgnitor
     * @pdOid 7c2abe74-9e63-4269-9099-57467961fd73
     */
    public void setSecondDistanceBetweenSpecimenAndIgnitor(int newSecondDistanceBetweenSpecimenAndIgnitor) {
        secondDistanceBetweenSpecimenAndIgnitor = newSecondDistanceBetweenSpecimenAndIgnitor;
    }

    /**
     * @pdOid 5261e68a-740e-4c09-8379-5ec4f7e63802
     */
    public boolean getSpecimenFlamed() {
        return specimenFlamed;
    }

    /**
     * @param newSpecimenFlamed
     * @pdOid e2ea3088-3839-4b96-bb32-a917bf9d506b
     */
    public void setSpecimenFlamed(boolean newSpecimenFlamed) {
        specimenFlamed = newSpecimenFlamed;
    }

    /**
     * @pdOid f196b1f7-a924-4560-beb0-47cb01bb0211
     */
    public int getSpecimenFlameLength() {
        return specimenFlameLength;
    }

    /**
     * @param newSpecimenFlameLength
     * @pdOid 2e96f2a3-2c54-475a-8116-9f99372a6206
     */
    public void setSpecimenFlameLength(int newSpecimenFlameLength) {
        specimenFlameLength = newSpecimenFlameLength;
    }

    /**
     * @pdOid e5a7763d-318d-4745-9fd9-04f67544125e
     */
    public int getSpecimenBurnoffLength() {
        return specimenBurnoffLength;
    }

    /**
     * @param newSpecimenBurnoffLength
     * @pdOid d3081a9d-cf68-4800-84ca-933352848d90
     */
    public void setSpecimenBurnoffLength(int newSpecimenBurnoffLength) {
        specimenBurnoffLength = newSpecimenBurnoffLength;
    }

    /**
     * @pdOid 84244ed1-559a-4f7d-9891-4b98dc4b7de9
     */
    public int getSpecimenBurnTime() {
        return specimenBurnTime;
    }

    /**
     * @param newSpecimenBurnTime
     * @pdOid 449da6ee-97e2-47a4-adb1-76f7fdbbf045
     */
    public void setSpecimenBurnTime(int newSpecimenBurnTime) {
        specimenBurnTime = newSpecimenBurnTime;
    }

}