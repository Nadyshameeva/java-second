package ru.kemsu;

import java.util.ArrayList;
import java.util.List;

public class OddEvenSeparator {
    private final List<Integer> list;

    public OddEvenSeparator() {
        list = new ArrayList<Integer>();
    }

    public void addNumber(int number) {
        list.add(number);
    }

    public void even() {
        System.out.println("Even list: ");

        list.forEach(e -> {
            if (e % 2 == 0)
                System.out.print(e + ' ');
        });

        System.out.println();
    }

    public void odd() {
        System.out.println("Odd list: ");

        list.forEach(e -> {
            if (e % 2 != 0)
                System.out.print(e + ' ');
        });

        System.out.println();
    }
}
