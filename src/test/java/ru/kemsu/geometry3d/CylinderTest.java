package ru.kemsu.geometry3d;

import org.junit.jupiter.api.Test;
import ru.kemsu.exceptions.BaseNullException;
import ru.kemsu.exceptions.InvalidFigureParamException;
import ru.kemsu.geometry2d.Circle;

import static org.junit.jupiter.api.Assertions.*;

class CylinderTest {

    @Test
    void cannotCreateCylinderNullBase() {
        assertThrows(BaseNullException.class, () -> new Cylinder(null, 4));
    }

    @Test
    void cannotCreateCylinderNonPositiveHeight() {
        assertThrows(InvalidFigureParamException.class, () -> new Cylinder(new Circle(5), 0));
    }

    @Test
    void volume() {
        Cylinder cylinder = new Cylinder(new Circle(5), 5);

        assertEquals((5 * 5 * Math.PI) * 5, cylinder.volume());
    }
}