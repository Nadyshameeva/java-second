package ru.kemsu.geometry2d;

import org.junit.jupiter.api.Test;
import ru.kemsu.exceptions.InvalidFigureParamException;

import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {

    @Test
    void cannotCreateRectangle() {
        assertThrows(InvalidFigureParamException.class, () -> new Rectangle(-2, 1));
    }

    @Test
    void area() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(rectangle.area(), 2);
    }

    @Test
    void perimeter() {
        Rectangle rectangle = new Rectangle(1, 2);
        assertEquals(rectangle.perimeter(), 6);
    }
}