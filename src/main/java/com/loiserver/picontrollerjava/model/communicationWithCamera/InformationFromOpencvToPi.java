package com.loiserver.picontrollerjava.model.communicationWithCamera;

/***********************************************************************
 * Module:  InformationFromOpencvToPi.java
 * Author:  nanj
 * Purpose: Defines the Class InformationFromOpencvToPi
 ***********************************************************************/

import java.util.*;

/** @pdOid 7097a0d0-1448-4a64-89da-265838286da2 */
public class InformationFromOpencvToPi {
    /** @pdOid d7910ae7-7092-4ae9-a00d-9e80b30a6eb1 */
    private String function;
    /** @pdOid 35ab99ec-cab2-4c34-b50f-1bb457a4fef7 */
    private int direction;
    /** @pdOid b2545cba-283f-4151-885e-34a17030f05d */
    private boolean cameraOK;
    /** @pdOid 468a67e0-4f74-44c6-99f6-ec2084713710 */
    private boolean ignitorFlamed;
    /** @pdOid f8ed845b-68b4-4113-b6fa-1d8b8a50616c */
    private int ignitorFlameLength;
    /** @pdOid fecffc6f-43be-488b-bad3-1ba1f615f0d7 */
    private int specimenLength;
    /** @pdOid 0e8a2e0d-c265-420a-b226-8756e9b0954b */
    private int firstDistanceBetweenSpecimenAndIgnitor;
    /** @pdOid a1fa9a74-d9dc-4c04-bb0c-48c85bb5b7ba */
    private int secondDistanceBetweenSpecimenAndIgnitor;
    /** @pdOid ff136281-fec2-4612-86da-4d8496f469c5 */
    private boolean specimenFlamed;
    /** @pdOid 8efbbee3-1f23-4d1d-b0db-e05ccdacc404 */
    private int specimenFlameLength;
    /** @pdOid 2ed22fa3-b76a-4fd4-9215-684ec5c4a1bd */
    private int specimenBurnoffLength;
    /** @pdOid e667da76-7b2f-4fde-80b7-97b6c974a3d9 */
    private int specimenBurnTime;

    /** @pdOid 580b13d5-dfbe-4071-bec2-5bc7af468823 */
    public String getFunction() {
        return function;
    }

    /** @param newFunction
     * @pdOid 9fc56d9c-736d-4f4d-a5bc-1e76ab8474ae */
    public void setFunction(String newFunction) {
        function = newFunction;
    }

    /** @pdOid 3afc8078-936d-4162-b1ed-6c2590e7cfcf */
    public int getDirection() {
        return direction;
    }

    /** @param newDirection
     * @pdOid fe186051-140c-4fe0-b839-4522420d8bc7 */
    public void setDirection(int newDirection) {
        direction = newDirection;
    }

    /** @pdOid 86500ed0-6441-403f-b37e-b925b71271dc */
    public boolean getCameraOK() {
        return cameraOK;
    }

    /** @param newCameraOK
     * @pdOid b0a76f02-f618-4126-8bf0-b0b51534cc5c */
    public void setCameraOK(boolean newCameraOK) {
        cameraOK = newCameraOK;
    }

    /** @pdOid 8eb05010-c9f3-4ea4-abd9-728e0cceca73 */
    public boolean getIgnitorFlamed() {
        return ignitorFlamed;
    }

    /** @param newIgnitorFlamed
     * @pdOid c1f0dd73-90d0-436d-93c2-fdebd2f270e2 */
    public void setIgnitorFlamed(boolean newIgnitorFlamed) {
        ignitorFlamed = newIgnitorFlamed;
    }

    /** @pdOid 2b39daa7-db05-407f-9781-8fac70b297be */
    public int getIgnitorFlameLength() {
        return ignitorFlameLength;
    }

    /** @param newIgnitorFlameLength
     * @pdOid 96221486-2058-42ee-97c5-e01754a79554 */
    public void setIgnitorFlameLength(int newIgnitorFlameLength) {
        ignitorFlameLength = newIgnitorFlameLength;
    }

    /** @pdOid 59ea9232-c460-4ab7-a979-8aba45c4d15a */
    public int getSpecimenLength() {
        return specimenLength;
    }

    /** @param newSpecimenLength
     * @pdOid 78896691-c702-473e-af6e-465e2e9d5a43 */
    public void setSpecimenLength(int newSpecimenLength) {
        specimenLength = newSpecimenLength;
    }

    /** @pdOid 15f76292-0a9d-4fa9-8750-32e5a4a635a9 */
    public int getFirstDistanceBetweenSpecimenAndIgnitor() {
        return firstDistanceBetweenSpecimenAndIgnitor;
    }

    /** @param newFirstDistanceBetweenSpecimenAndIgnitor
     * @pdOid 21b50313-a2b8-4796-b1dc-a479e56d1163 */
    public void setFirstDistanceBetweenSpecimenAndIgnitor(int newFirstDistanceBetweenSpecimenAndIgnitor) {
        firstDistanceBetweenSpecimenAndIgnitor = newFirstDistanceBetweenSpecimenAndIgnitor;
    }

    /** @pdOid 646e5ce3-3614-4fe0-984f-53bb318e48b7 */
    public int getSecondDistanceBetweenSpecimenAndIgnitor() {
        return secondDistanceBetweenSpecimenAndIgnitor;
    }

    /** @param newSecondDistanceBetweenSpecimenAndIgnitor
     * @pdOid 7c2abe74-9e63-4269-9099-57467961fd73 */
    public void setSecondDistanceBetweenSpecimenAndIgnitor(int newSecondDistanceBetweenSpecimenAndIgnitor) {
        secondDistanceBetweenSpecimenAndIgnitor = newSecondDistanceBetweenSpecimenAndIgnitor;
    }

    /** @pdOid 5261e68a-740e-4c09-8379-5ec4f7e63802 */
    public boolean getSpecimenFlamed() {
        return specimenFlamed;
    }

    /** @param newSpecimenFlamed
     * @pdOid e2ea3088-3839-4b96-bb32-a917bf9d506b */
    public void setSpecimenFlamed(boolean newSpecimenFlamed) {
        specimenFlamed = newSpecimenFlamed;
    }

    /** @pdOid f196b1f7-a924-4560-beb0-47cb01bb0211 */
    public int getSpecimenFlameLength() {
        return specimenFlameLength;
    }

    /** @param newSpecimenFlameLength
     * @pdOid 2e96f2a3-2c54-475a-8116-9f99372a6206 */
    public void setSpecimenFlameLength(int newSpecimenFlameLength) {
        specimenFlameLength = newSpecimenFlameLength;
    }

    /** @pdOid e5a7763d-318d-4745-9fd9-04f67544125e */
    public int getSpecimenBurnoffLength() {
        return specimenBurnoffLength;
    }

    /** @param newSpecimenBurnoffLength
     * @pdOid d3081a9d-cf68-4800-84ca-933352848d90 */
    public void setSpecimenBurnoffLength(int newSpecimenBurnoffLength) {
        specimenBurnoffLength = newSpecimenBurnoffLength;
    }

    /** @pdOid 84244ed1-559a-4f7d-9891-4b98dc4b7de9 */
    public int getSpecimenBurnTime() {
        return specimenBurnTime;
    }

    /** @param newSpecimenBurnTime
     * @pdOid 449da6ee-97e2-47a4-adb1-76f7fdbbf045 */
    public void setSpecimenBurnTime(int newSpecimenBurnTime) {
        specimenBurnTime = newSpecimenBurnTime;
    }

}