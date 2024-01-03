package com.switchfully.challenge;

public class CircumferenceCalculatorTool {
    public double calculate(Circle circle) {
        return circle.getRadius() * Math.PI * 2;
    }

    public double calculate(Rectangle rectangle) {
        return rectangle.getLength() * 2 + rectangle.getWidth() * 2;
    }

    public double calculate(Square square) {
        return square.getSide() * 4;
    }
}
