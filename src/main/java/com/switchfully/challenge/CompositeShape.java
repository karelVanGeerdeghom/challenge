package com.switchfully.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompositeShape extends Shape {

    private List<Shape> shapeList = new ArrayList<>();

    public void addShape(Shape shape) {
        shapeList.add(shape);
    }

    @Override
    public double getSurface() {
        // TODO implement this method
        return 0;
    }
}
