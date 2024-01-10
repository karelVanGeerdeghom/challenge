package com.switchfully.challenge;

public interface Tool<T> {
    T apply(Shape shape);

    T apply(CompositeShape compositeShape);

    T apply(Circle circle);

    T apply(Rectangle rectangle);

    T apply(Square square);
}
