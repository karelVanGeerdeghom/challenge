package com.switchfully.challenge;

public abstract class Shape {

    public abstract double getSurface();

    public abstract double applyToolAndGetResult(CircumferenceCalculatorTool circumferenceCalculatorTool);

    public abstract String applyToolAndGetResult(HtmlGeneratorTool htmlGeneratorTool);
}
