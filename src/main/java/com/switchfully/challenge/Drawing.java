package com.switchfully.challenge;

import java.util.ArrayList;
import java.util.List;

public class Drawing {

    private String name;
    private List<Shape> shapeList = new ArrayList<>();

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
        shapeList.add(shape);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    public double getTotalSurface() {
        return shapeList.stream().reduce(0.0, (totalSurface, shape) -> totalSurface + shape.getSurface(), Double::sum);
    }

    public Double applyToolAndGetResult(Tool<Double> tool) {
        return tool.apply(this);
    }
}
