package com.switchfully.challenge;

public abstract class Shape {

    public abstract double getSurface();

    public abstract <T> T applyToolAndGetResult(Tool<T> tool);
}
