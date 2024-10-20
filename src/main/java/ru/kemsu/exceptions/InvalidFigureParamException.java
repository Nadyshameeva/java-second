package ru.kemsu.exceptions;

public class InvalidFigureParamException extends RuntimeException {
    public InvalidFigureParamException(String message) {
        super(message);
    }
}
