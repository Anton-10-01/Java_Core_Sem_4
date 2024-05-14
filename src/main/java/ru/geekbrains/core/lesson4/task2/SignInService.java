package ru.geekbrains.core.lesson4.task2;

public class SignInService {
    /**
     * Метод проверки логина  и пароля
     * @param authentifier
     * @return
     * @throws WrongLoginException
     * @throws WrongPasswordException
     */
    public static boolean checkCredentials(Authentifier authentifier) throws WrongLoginException, WrongPasswordException {
        boolean conf = authentifier.getPassword().equals(authentifier.getCofirmPassword());
        int loginLength = authentifier.getLogin().length();
        int passwordLength = authentifier.getPassword().length();
        if(loginLength >= 20){
            throw new WrongLoginException(loginLength);
        } else if (passwordLength < 20) {
            throw new WrongPasswordException(passwordLength, conf);
        } else {
            //TODO: Проверка логина и пароля на уровне субд
            return true;
        }
    }
}
