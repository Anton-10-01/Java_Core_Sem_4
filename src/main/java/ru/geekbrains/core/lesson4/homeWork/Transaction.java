package ru.geekbrains.core.lesson4.homeWork;

public class Transaction {
    public boolean transactionCreditAccount(CreditAccount creditAccount, DebitAccount debitAccount) throws InsufficientFundsException {
        if (debitAccount.getInitBalance() + debitAccount.getDepositAmount() < debitAccount.getWithdrawalAmount()) {
            throw new InsufficientFundsException("Попытка перевода средств, сумма которых превышает текущий баланс");
        } else {
            int init = creditAccount.getInitBalance();
            init += debitAccount.getWithdrawalAmount();
            creditAccount.setInitBalance(init);
            return true;
        }
    }
    public boolean transactionDebitAccount(CreditAccount creditAccount, DebitAccount debitAccount) throws InsufficientFundsException {
        if (creditAccount.getInitBalance() + creditAccount.getDepositAmount() < creditAccount.getWithdrawalAmount()) {
            throw new InsufficientFundsException("Попытка перевода средств, сумма которых превышает текущий баланс");
        } else {
            int init = debitAccount.getInitBalance();
            init += creditAccount.getWithdrawalAmount();
            debitAccount.setInitBalance(init);
            return true;
        }
    }
}
