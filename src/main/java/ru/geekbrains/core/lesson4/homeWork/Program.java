package ru.geekbrains.core.lesson4.homeWork;
/*
Создать программу управления банковским счетом (Account).
Программа должна позволять пользователю вводить начальный баланс счета, сумму депозита и сумму снятия средств. При этом она должна обрабатывать следующие исключительные ситуации:

Попытка создать счет с отрицательным начальным балансом должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка внести депозит с отрицательной суммой должна вызывать исключение IllegalArgumentException с соответствующим сообщением.
Попытка снять средства, сумма которых превышает текущий баланс, должна вызывать исключение InsufficientFundsException с сообщением о недостаточных средствах и текущим балансом.

Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.

2*.
Создать несколько типов счетов, унаследованных от Account, например: CreditAcciunt, DebitAccount.
Создать класс (Transaction), позволяющий проводить транзакции между счетами (переводить сумму с одного счета на другой)

Класс Transaction должен возбуждать исключение в случае неудачной попытки перевести деньги с одного счета на другой.

Продемонстрируйте работу вашего приложения:
Программа должна обрабатывать все исключения с помощью конструкции try-catch, выводя соответствующие сообщения об ошибках.
 */
public class Program {
    public static void main(String[] args) {
        Account[] accounts = {
                new Account(new User("Anton", 25), -10000, 5000, 1000),
                new Account(new User("Vova", 30),10000, -5000, 1000),
                new Account(new User("Vlad", 35),9000000, 250000, 500000)
        };
        newAccount(accounts);

        Transaction transaction = new Transaction();
        CreditAccount creditAccount = new CreditAccount(new User("Anton", 25), 10000, 5000, 1000);
        DebitAccount debitAccount = new DebitAccount(new User("Vova", 30),10000, 5000, 2000);
        try {
            if(transaction.transactionCreditAccount(creditAccount, debitAccount)){
                System.out.println("Клиент:\n" + creditAccount.user +
                        "\n\tбаланс счета = " + creditAccount.getInitBalance() +
                        "\n\tсумма депозита = " + creditAccount.getDepositAmount() +
                        "\n\tсумма перевода = " + debitAccount.getWithdrawalAmount());
            }
            if(transaction.transactionDebitAccount(creditAccount, debitAccount)){
                System.out.println("Клиент:\n" + debitAccount.user +
                        "\n\tбаланс счета = " + debitAccount.getInitBalance() +
                        "\n\tсумма депозита = " + debitAccount.getDepositAmount() +
                        "\n\tсумма перевода = " + creditAccount.getWithdrawalAmount());
            }
        }catch (InsufficientFundsException e){
            e.printStackTrace();
        }

    }
    public static void newAccount(Account[] accounts){
        for(Account account: accounts){
            try{
                if(BalanceEntry.checkAccount(account)){
                    System.out.println(account);
                }
            } catch (IllegalArgumentException e){
                e.printStackTrace();
            } catch (InsufficientFundsException e){
                e.printStackTrace();
            }
        }
    }
}
