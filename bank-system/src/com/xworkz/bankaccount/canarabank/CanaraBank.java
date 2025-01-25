package com.xworkz.bankaccount.canarabank;

import com.xworkz.bankaccount.bankaccount.BankAccount;

public class CanaraBank extends BankAccount {

    double minBalance;
    double interest=7.8;

    public  CanaraBank(double minBalance){
        setBalance(minBalance);
    }

    public void rateOfInterest() {
        double interestAmount = getBalance() * interest / 100;
        deposit(interestAmount);
    }
}
