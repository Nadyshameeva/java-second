package ru.kemsu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TableTest {

    private Table table;
    private int[][] source;

    @BeforeEach
    void setUp() {
        int rows = 3;
        int columns = 3;

        source = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        table = new Table(rows, columns);

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < columns; j++)
                table.setValue(i, j, source[i][j]);
    }

    @Test
    void rows() {
        assertEquals(source.length, table.rows());
    }

    @Test
    void columns() {
        assertEquals(source[0].length, table.columns());
    }

    @Test
    void average() {
        double average = table.average();
        double averageSource = 0;

        for (int[] row : source)
            for (int column : row)
                averageSource += column;

        averageSource /= source.length * source[0].length;

        assertEquals(averageSource, average);
    }

    @Test
    void getValue() {
        int i = 2;
        int j = 1;

        assertEquals(source[i][j], table.getValue(i, j));
    }

    @Test
    void setValue() {
        int i = 2;
        int j = 1;
        int value = 777;

        source[i][j] = value;
        table.setValue(i, j, value);

        assertEquals(source[i][j], table.getValue(i, j));
    }
}