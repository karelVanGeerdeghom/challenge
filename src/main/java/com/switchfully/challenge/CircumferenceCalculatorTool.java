package com.switchfully.challenge;

public class CircumferenceCalculatorTool implements Tool<Double> {
    @Override
    public Double apply(Circle circle) {
        return circle.getRadius() * Math.PI * 2;
    }

    @Override
    public Double apply(Rectangle rectangle) {
        return rectangle.getLength() * 2 + rectangle.getWidth() * 2;
    }

    @Override
    public Double apply(Square square) {
        return square.getSide() * 4;
    }
}
