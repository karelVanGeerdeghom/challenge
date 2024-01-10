package com.switchfully.challenge;

public class Drawing {

    private String name;
    private final CompositeShape compositeShape = new CompositeShape();

    public Drawing(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addShape(Shape shape) {
        this.compositeShape.addShape(shape);
    }

    public double getTotalSurface() {
        return this.compositeShape.getSurface();
    }

    public <T> T applyToolAndGetResult(Tool<T> tool) {
        return tool.apply(this.compositeShape);
    }
}
