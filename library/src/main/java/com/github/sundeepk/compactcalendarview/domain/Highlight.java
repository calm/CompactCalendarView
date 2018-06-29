package com.github.sundeepk.compactcalendarview.domain;

public class Highlight {

   public enum Mode {Start, End, Middle}

    private int color;
    private float radius;
    private Mode mode;
    private int startGradientColor;
    private int endGradientColor;

    public Highlight(int color, float radius, Mode mode, int startGradientColor, int endGradientColor) {
        this.color = color;
        this.radius = radius;
        this.mode = mode;
        this.startGradientColor = startGradientColor;
        this.endGradientColor = endGradientColor;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public float getRadius() {
        return radius;
    }

    public void setRadius(float radius) {
        this.radius = radius;
    }

    public Mode getMode() {
        return mode;
    }

    public void setMode(Mode mode) {
        this.mode = mode;
    }
    
    public int getStartGradientColor() {
        return startGradientColor;
    }

    public void setStartGradientColor(int startGradientColor) {
        this.startGradientColor = startGradientColor;
    }

    public int getEndGradientColor() {
        return endGradientColor;
    }

    public void setEndGradientColor(int endGradientColor) {
        this.endGradientColor = endGradientColor;
    }
}
