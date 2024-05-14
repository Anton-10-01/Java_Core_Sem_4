package ru.geekbrains.core.lesson4.homeWork;

public class Account {
    private int initBalance;
    private int depositAmount;
    private int withdrawalAmount;
    User user;

    public Account(User user, int initBalance, int depositAmount, int withdrawalAmount) {
        this.user = user;
        this.initBalance = initBalance;
        this.depositAmount = depositAmount;
        this.withdrawalAmount = withdrawalAmount;
    }

    public int getInitBalance() {
        return initBalance;
    }

    public void setInitBalance(int initBalance) {
        this.initBalance = initBalance;
    }

    public int getDepositAmount() {
        return depositAmount;
    }

    public int getWithdrawalAmount() {
        return withdrawalAmount;
    }

    @Override
    public String toString() {
        return "Клиент:\n" + user +
                "\n\tначальный баланс счета = " + initBalance +
                "\n\tсумма депозита = " + depositAmount +
                "\n\tсумма снятия средств = " + withdrawalAmount;
    }
}
