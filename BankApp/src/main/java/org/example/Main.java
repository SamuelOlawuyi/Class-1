package org.example;

import org.example.Entity.User;
import org.example.Enum.Role;
import org.example.ServiceImpl.transactionServiceImpl;
import java.math.BigDecimal;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        User accessBankCustomer = new User(Role.CUSTOMER);
        User accessBankCashier = new User(Role.CASHIER);
        transactionServiceImpl transactionService = new transactionServiceImpl();

        //User accessBankCustomer = new User(Role.CUSTOMER);
        //User accessBankCashier = new User(Role.CASHIER);
        //transactionServiceImpl transactionService = new transactionServiceImpl();
        transactionService.depositFunds(accessBankCashier, accessBankCustomer, new BigDecimal());
        transactionService.withdrawFunds(accessBankCashier, accessBankCustomer, new BigDecimal());


    }

}