package ru.kemsu.geometry2d;

import ru.kemsu.exceptions.InvalidFigureParamException;

public class Circle implements Figure {
    private final double radius;

    public Circle(double radius) {
        if (radius <= 0)
            throw new InvalidFigureParamException("Radius cannot be negative");

        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public double perimeter() {
        return Math.PI * 2 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}
