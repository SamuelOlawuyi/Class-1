package org.example.ServiceImpl;

import org.example.Entity.Transaction;
import org.example.Entity.User;
import org.example.Services.TransactionService;

import java.math.BigDecimal;

public class transactionServiceImpl implements TransactionService {
    @Override
    public Transaction depositFunds(User cashier, User customer, BigDecimal cashDeposit) {
       //check customer if they are our customer
        // check if withdrawal is within limit
        //deposit to account
        //update account details
        //create transaction object
        //storing transaction object
        //return transaction object
        return null;
    }

    @Override
    public BigDecimal withdrawFunds(User cashier, User customer, BigDecimal expectedCash) {
        //check customer if they exist in our system
        //check withdrawal limit against expecteCash
        //withdraw funds from account details
        //update accountDetails balance
        //return funds
        //
        return null;
    }
}
