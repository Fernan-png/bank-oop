package org.ies.bank.components;

import org.ies.bank.model.Account;
import org.ies.bank.model.Customer;

import java.util.Scanner;

public class CustomerReader {
    private final Scanner scanner;
    private final CustomerReader customerReader;

    public CustomerReader(Scanner scanner, CustomerReader customerReader) {
        this.scanner = scanner;
        this.customerReader = customerReader;
    }

    public Account read() {

        System.out.println("Introduce el IBAN de la cuenta: ");
        String iban = scanner.nextLine();

        System.out.println("Introduce el saldo inicial de la cuenta: ");
        double saldo = scanner.nextDouble();
    }
}
