package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main(String[] args) {

        //INSTANCIANDO O OBJETO ACCOUNT
        Account acc1 = new Account(1001, "Alex", 1000.0);
        acc1.withDraw(200.0);
        System.out.println(acc1.getBalance());

       //INSTANCIANDO OUTRO OBJETO ACCOUNT
        Account acc2 = new SavingsAccount(1002, "Maria", 1000.0, 0.01);
        acc2.withDraw(200.0);
        System.out.println(acc2.getBalance());

        //INSTANCIANDO OUTRO BOJETO ACCOUNT
        Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
        acc3.withDraw(200.0);
        System.out.println(acc3.getBalance());
    }
}
