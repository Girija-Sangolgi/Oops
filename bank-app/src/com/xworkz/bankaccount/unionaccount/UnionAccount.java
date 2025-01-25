package com.xworkz.bankaccount.unionaccount;

import com.xworkz.bankaccount.bankaccount.BankAccount;

    public class UnionAccount extends BankAccount {

        double minBalance;
        double interest=7.8;


        public void unionAccount(double minBalance){
            setBalance(minBalance);
        }

        public void rateOfInterest() {
            double interestAmount = getBalance() * interest / 100;
            deposit(interestAmount);
        }
    }

