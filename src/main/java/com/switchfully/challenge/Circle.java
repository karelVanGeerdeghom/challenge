package com.switchfully.challenge;

public class Circle extends Shape {

    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return Math.PI * radius * radius;
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
