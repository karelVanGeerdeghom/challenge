package com.switchfully.challenge;

public class HtmlGeneratorTool {
    public String generate(Circle circle) {
        return "<div style=\"width: " + circle.getRadius() * 2 + "px; height: " + circle.getRadius() * 2 + "px; border-radius: 50%;\"></div>";
    }

    public String generate(Rectangle rectangle) {
        return "<div style=\"width: " + rectangle.getWidth() + "px; height: " + rectangle.getLength() + "px;\"></div>";
    }

    public String generate(Square square) {
        return "<div style=\"width: " + square.getSide() + "px; height: " + square.getSide() + "px;\"></div>";
    }
}
