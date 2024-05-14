package ru.geekbrains.core.lesson4.task2;

public class Authentifier {
    private final String login;
    private final String password;
    private final String cofirmPassword;

    public Authentifier(String login, String password, String cofirmPassword) {
        this.login = login;
        this.password = password;
        this.cofirmPassword = cofirmPassword;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getCofirmPassword() {
        return cofirmPassword;
    }
}
