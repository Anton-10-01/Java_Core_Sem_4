package ru.geekbrains.core.lesson4.homeWork;

public class BalanceEntry {
    public static boolean checkAccount(Account account) throws IllegalArgumentException, InsufficientFundsException {
        if(account.getInitBalance() < 0){
            throw new IllegalArgumentException("Попытка создать счет с отрицательным начальным балансом");
        } else if(account.getDepositAmount() < 0){
            throw new IllegalArgumentException("Попытка внести депозит с отрицательной суммой");
        } else if (account.getInitBalance() + account.getDepositAmount() < account.getWithdrawalAmount()) {
            throw new InsufficientFundsException("Попытка снять средства, сумма которых превышает текущий баланс");
        } else {
            return true;
        }
    }
}
