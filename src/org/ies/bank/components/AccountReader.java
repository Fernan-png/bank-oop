package org.ies.bank.components;

import org.ies.bank.model.Account;

import java.util.Scanner;

public class AccountReader {
    private final Scanner scanner;
    private final AccountReader accountReader;

    public AccountReader(Scanner scanner, AccountReader accountReader) {
        this.scanner = scanner;
        this.accountReader = accountReader;
    }

    public Account read() {
        Scanner scanner = new Scanner(System.in);


    }
}
