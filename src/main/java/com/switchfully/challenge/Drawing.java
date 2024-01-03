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

    public double getTotalSurface() {
        return shapeList.stream().reduce(0.0, (totalSurface, shape) -> totalSurface + shape.getSurface(), Double::sum);
    }

    public double applyToolAndGetResult(CircumferenceCalculatorTool circumferenceCalculatorTool) {
        return shapeList.stream().reduce(0.0, (totalCircumference, shape) -> totalCircumference + shape.applyToolAndGetResult(circumferenceCalculatorTool), Double::sum);
    }

    public String applyToolAndGetResult(HtmlGeneratorTool htmlGeneratorTool) {
        return shapeList.stream().reduce("", (totalHtml, shape) -> totalHtml + shape.applyToolAndGetResult(htmlGeneratorTool), String::concat);
    }
}
