package com.switchfully.challenge;

public class HtmlGeneratorTool implements Tool<String> {
    @Override
    public String apply(Circle circle) {
        return "<div style=\"width: " + circle.getRadius() * 2 + "px; height: " + circle.getRadius() * 2 + "px; border-radius: 50%;\"></div>";
    }

    @Override
    public String apply(Rectangle rectangle) {
        return "<div style=\"width: " + rectangle.getWidth() + "px; height: " + rectangle.getLength() + "px;\"></div>";
    }

    @Override
    public String apply(Square square) {
        return "<div style=\"width: " + square.getSide() + "px; height: " + square.getSide() + "px;\"></div>";
    }
}
