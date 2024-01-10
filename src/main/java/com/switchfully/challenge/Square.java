package com.switchfully.challenge;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getSurface() {
        return Math.pow(side, 2);
    }

    @Override
    public <T> T applyToolAndGetResult(Tool<T> tool) {
        return tool.apply(this);
    }
}
