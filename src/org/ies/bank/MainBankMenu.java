package org.ies.bank;

import org.ies.bank.components.*;

import java.util.Scanner;

public class MainBankMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CustomerReader customerReader = new CustomerReader(scanner);
        AccountReader accountReader = new AccountReader(scanner, customerReader);
        BankReader bankReader = new BankReader(scanner, accountReader);
        BankMenu bankMenu = new BankMenu(scanner, bankReader);

        bankMenu.run();
    }
}

//