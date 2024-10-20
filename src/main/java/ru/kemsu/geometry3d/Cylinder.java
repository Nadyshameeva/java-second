package ru.kemsu.geometry3d;

import ru.kemsu.exceptions.BaseNullException;
import ru.kemsu.exceptions.InvalidFigureParamException;
import ru.kemsu.geometry2d.Figure;

public class Cylinder {
    private final Figure base;
    private final double height;

    public Cylinder(Figure base, double height) {
        if (base == null)
            throw new BaseNullException("Cylinder base cannot be null");
        if (height <= 0)
            throw new InvalidFigureParamException("Height cannot be negative");

        this.base = base;
        this.height = height;
    }

    public double volume() {
        return base.area() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
