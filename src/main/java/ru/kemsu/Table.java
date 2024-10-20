package ru.kemsu;

import java.util.Arrays;

public class Table {
    private final int rows;
    private final int columns;
    private final int[][] table;

    public Table(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        table = new int[rows][columns];
    }

    public int getValue(int row, int column) {
        return table[row][column];
    }

    public void setValue(int row, int column, int value) {
        table[row][column] = value;
    }

    public int rows() {
        return rows;
    }

    public int columns() {
        return columns;
    }

    @Override
    public String toString() {
        return "Table{" +
                "rows=" + rows +
                ", columns=" + columns +
                ", table=" + Arrays.toString(table) +
                '}';
    }

    public double average() {
        double sum = 0;

        for (int[] row : table) {
            for (int element : row) {
                sum += element;
            }
        }

        return sum / rows / columns;
    }
}
