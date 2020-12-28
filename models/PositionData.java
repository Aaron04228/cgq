package com.wuyr.catchpiggy.models;

public class PositionData {
    public float startX;
    public float startY;
    public float endX;
    public float endY;

    @Override
    public String toString() {
        return startX + "," + startY + "," + endX + "," + endY;
    }
}
