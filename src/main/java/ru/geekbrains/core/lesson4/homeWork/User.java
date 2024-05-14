package ru.geekbrains.core.lesson4.homeWork;

public class User {
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Имя: '" + name + '\'' +
                ", Возраст: " + age;
    }
}
