package com.switchfully.challenge;

public class Rectangle extends Shape {

    private double length;

    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getSurface() {
        return length * width;
    }

    @Override
    public <T> T applyToolAndGetResult(Tool<T> tool) {
        return tool.apply(this);
    }
}
