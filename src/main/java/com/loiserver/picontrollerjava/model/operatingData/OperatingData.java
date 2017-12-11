package com.loiserver.picontrollerjava.model.operatingData;

import org.springframework.stereotype.Component;

@Component
public class OperatingData {
    private boolean error = false;

    private int specimenIndex = 0;

    private int ignitorFlameLength = 0;
    private int specimenInitialLength = 0;
    private int specimenFinalLength = 0;
    private int specimenFlameLength = 0;

    private float oxygenRatio = 0;
    private float chimmyTempture = 0;

    public int getSpecimenIndex() {
        return specimenIndex;
    }

    public float getChimmyTempture() {
        return chimmyTempture;
    }

    public float getOxygenRatio() {
        return oxygenRatio;
    }

    public int getIgnitorFlameLength() {
        return ignitorFlameLength;
    }

    public int getSpecimenFinalLength() {
        return specimenFinalLength;
    }

    public int getSpecimenFlameLength() {
        return specimenFlameLength;
    }

    public int getSpecimenInitialLength() {
        return specimenInitialLength;
    }

    public void setChimmyTempture(float chimmyTempture) {
        this.chimmyTempture = chimmyTempture;
    }

    public void setIgnitorFlameLength(int ignitorFlameLength) {
        this.ignitorFlameLength = ignitorFlameLength;
    }

    public void setOxygenRatio(float oxygenRatio) {
        this.oxygenRatio = oxygenRatio;
    }

    public void setSpecimenFinalLength(int specimenFinalLength) {
        this.specimenFinalLength = specimenFinalLength;
    }

    public void setSpecimenFlameLength(int specimenFlameLength) {
        this.specimenFlameLength = specimenFlameLength;
    }

    public void setSpecimenIndex(int specimenIndex) {
        this.specimenIndex = specimenIndex;
    }

    public void setSpecimenInitialLength(int specimenInitialLength) {
        this.specimenInitialLength = specimenInitialLength;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public boolean isError() {
        return error;
    }
}
