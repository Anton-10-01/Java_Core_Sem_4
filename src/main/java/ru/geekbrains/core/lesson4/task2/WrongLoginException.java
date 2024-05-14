package ru.geekbrains.core.lesson4.task2;

public class WrongLoginException extends Exception{
    private final int currentLength;

    public WrongLoginException(int currentLength) {
        super();
        this.currentLength = currentLength;
    }

    public int getCurrentLength() {
        return currentLength;
    }

    @Override
    public String getMessage() {
        return String.format("Ваше имя пользователя имеет некорретную длину, ожидалось < 20, получено %d.", currentLength);
    }
}
