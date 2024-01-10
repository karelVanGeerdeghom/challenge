package com.switchfully.challenge;

public class Main {
    public static void main(String[] args) {
        Drawing drawing = new Drawing("My wonderful drawing");

        Rectangle r1 = new Rectangle(2, 3);
        drawing.addShape(r1);

        Square s1 = new Square(6);
        drawing.addShape(s1);

        CompositeShape composite1 = new CompositeShape();
        Rectangle r3 = new Rectangle(2.5, 5);
        composite1.addShape(r3);
        drawing.addShape(composite1);

        CompositeShape composite2 = new CompositeShape();
        Rectangle r2 = new Rectangle(3, 4);
        Circle c1 = new Circle(2.5);
        composite2.addShape(r2);
        composite2.addShape(c1);
        composite2.addShape(composite1);
        drawing.addShape(composite2);

        double totalSurface = drawing.getTotalSurface();;
        System.out.println("Total surface is " + totalSurface);

        // TODO How would you add a "Square" as an additional shape?
/*
        // TODO implement a HTML generator for the drawing
        // DO NOT ADD toHtml() methods on the Shape classes!!!
        HtmlGeneratorTool htmlGeneratorTool = new HtmlGeneratorTool();
        String html = drawing.applyToolAndGetResult(htmlGeneratorTool);
        System.out.println("Html is " + html);
*/
        // TODO implement a Circumference calculator for the drawing
        // DO NOT ADD getCircumference() methods on the Shape classes!!!
        CircumferenceCalculatorTool circumferenceCalculatorTool = new CircumferenceCalculatorTool();
        double totalCircumference = drawing.applyToolAndGetResult(circumferenceCalculatorTool);
        System.out.println("Total circumference is " + totalCircumference);

        // DO NOT USE Casting
        // DO NOT USE instanceOf !!!
    }
}
