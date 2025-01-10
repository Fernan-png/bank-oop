package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Bank;

import java.util.Scanner;

public class BankApp2 {
    // Se necesita el BankReader para pedir un banco al usuario
    private final BankReader bankReader;

    public BankApp2(BankReader bankReader) {
        this.bankReader = bankReader;
    }

    public void run() {
        // Siempre empezamos pidiendo los datos con el reader
        Bank bank = bankReader.read();

        // Cuando se invoca findAccount, se sustituye la llamada por un objeto de tipo Account
        Account account = bank.findAccount("ES0001");
        if(account != null) {
            account.deposit(500);
        } else {
            System.out.println("No existe la cuenta");
        }

        Account account2 = bank.findAccount("ES0002");

        if(account2 != null) {
            account2.deposit(-30);
        } else {
            System.out.println("No existe la cuenta");
        }

        account.showInfo();
        account2.showInfo();

    }
}