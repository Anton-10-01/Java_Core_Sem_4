package ru.geekbrains.core.lesson4.homeWork;

public class DebitAccount extends Account{
    public DebitAccount(User user, int initBalance, int depositAmount, int withdrawalAmount) {
        super(user, initBalance, depositAmount, withdrawalAmount);
    }
}
