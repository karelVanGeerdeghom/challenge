package com.switchfully.challenge;

public abstract class Shape {

    public abstract double getSurface();

    public abstract Double applyToolAndGetResult(Tool<Double> tool);

//    public abstract String applyToolAndGetResult(Tool<String> tool);
}
