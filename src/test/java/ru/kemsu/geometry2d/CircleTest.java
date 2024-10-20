package ru.kemsu.geometry2d;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.kemsu.exceptions.InvalidFigureParamException;

import static org.junit.jupiter.api.Assertions.*;

class CircleTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void cannotCreateCircle() {
        assertThrows(InvalidFigureParamException.class, () -> new Circle(-5));
    }

    @Test
    void area() {
        Circle circle = new Circle(5);

        assertEquals(5 * 5 * Math.PI, circle.area());
    }

    @Test
    void perimeter() {
        Circle circle = new Circle(5);

        assertEquals(5 * 2 * Math.PI, circle.perimeter());
    }
}