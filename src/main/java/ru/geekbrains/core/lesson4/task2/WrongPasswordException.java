package ru.geekbrains.core.lesson4.task2;

public class WrongPasswordException extends Exception{
    private final int currentLength;
    private final boolean matchConfirm;
    public WrongPasswordException(int currentLength, boolean matchConfirm) {
        super();
        this.currentLength = currentLength;
        this.matchConfirm = matchConfirm;
    }

    @Override
    public String getMessage() {
        boolean badLength = currentLength <= 20;
        return String.format("Ваш пароль имеет %s длину %s %d. Пароль %s содержит подтверждения.",
                ((badLength) ? "некорректную" : "корректную"),
                ((badLength) ? ", ожидалось > 20, получили" : ","),
                currentLength,
                (matchConfirm) ? "" : "не ");
    }

    public int getCurrentLength() {
        return currentLength;
    }

    public boolean isMatchConfirm() {
        return matchConfirm;
    }
}
