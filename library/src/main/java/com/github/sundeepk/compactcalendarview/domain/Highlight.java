package com.github.sundeepk.compactcalendarview.domain;

public class Highlight {

   public enum Mode {Start, End, Middle, Single}

    private int color;
    private Mode mode;
    private int startGradientColor;
    private int endGradientColor;

    public Highlight(int color, Mode mode, int startGradientColor, int endGradientColor) {
        this.color = color;
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
