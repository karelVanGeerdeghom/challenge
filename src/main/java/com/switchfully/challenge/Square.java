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
    public double applyToolAndGetResult(CircumferenceCalculatorTool circumferenceCalculatorTool) {
        return circumferenceCalculatorTool.calculate(this);
    }

    @Override
    public String applyToolAndGetResult(HtmlGeneratorTool htmlGeneratorTool) {
        return htmlGeneratorTool.generate(this);
    }
}
