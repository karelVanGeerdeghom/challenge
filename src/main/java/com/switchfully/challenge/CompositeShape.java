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

    @Override
    public double applyToolAndGetResult(CircumferenceCalculatorTool circumferenceCalculatorTool) {
        return shapeList.stream().reduce(0.0, (totalCircumference, shape) -> totalCircumference + shape.applyToolAndGetResult(circumferenceCalculatorTool), Double::sum);
    }

    @Override
    public String applyToolAndGetResult(HtmlGeneratorTool htmlGeneratorTool) {
        return shapeList.stream().reduce("", (totalHtml, shape) -> totalHtml + shape.applyToolAndGetResult(htmlGeneratorTool), String::concat);
    }
}
