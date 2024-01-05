package com.switchfully.challenge;

public interface Tool<T> {
    T apply(Circle circle);

    T apply(Rectangle rectangle);

    T apply(Square square);
}
