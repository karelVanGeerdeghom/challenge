package com.switchfully.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {

    private List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    public List<Shape> getShapeList() {
        return shapeList;
    }

    @Override
    public double getSurface() {
        return shapeList.stream().reduce(0.0, (totalSurface, shape) -> totalSurface + shape.getSurface(), Double::sum);
    }

}
