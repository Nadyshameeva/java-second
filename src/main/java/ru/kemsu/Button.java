package ru.kemsu;

public class Button {
    int numberOfClicks;

    void click() {
        numberOfClicks++;
        System.out.println("Button clicked: " + numberOfClicks);
    }
}
