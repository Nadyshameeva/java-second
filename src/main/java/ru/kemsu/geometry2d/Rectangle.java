package ru.kemsu.geometry2d;

import ru.kemsu.exceptions.InvalidFigureParamException;

public class Rectangle implements Figure {
    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        if (length <= 0 || width <= 0)
            throw new InvalidFigureParamException("Length and width should be greater than 0");

        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return (length + width) * 2;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                '}';
    }
}
