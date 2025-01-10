package org.ies.bank;

import org.ies.bank.components.*;

import java.util.Scanner;

public class MainBankApp2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var customerReader = new CustomerReader(scanner);
        var accountReader = new AccountReader(scanner, customerReader);
        var bankReader = new BankReader(scanner, accountReader);
        var bankApp = new BankApp2(bankReader);

        bankApp.run();


    }
}