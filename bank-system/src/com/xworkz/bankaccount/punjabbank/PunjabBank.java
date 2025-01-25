package com.xworkz.bankaccount.punjabbank;

import com.xworkz.bankaccount.bankaccount.BankAccount;

public class PunjabBank extends BankAccount {

    double minBalance;

    double interest=5.7;

    public void PunjabBank(){
        System.out.println("default constructor invoked");

    }

    public void PunjabBank(double minBalance){
        setBalance(minBalance);
    }

   public void rateOfInterest(){
        double interestAmount=getBalance()*interest/100;
        deposit(interestAmount);
   }
}
