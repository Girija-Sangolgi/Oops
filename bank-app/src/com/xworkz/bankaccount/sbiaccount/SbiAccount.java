package com.xworkz.bankaccount.sbiaccount;

import com.xworkz.bankaccount.bankaccount.BankAccount;

public class SbiAccount extends BankAccount {

        double minBalance;

        double interest=5.7;

        public void SbiAccount(){
            System.out.println("default constructor invoked");

        }

        public void SbiAccount(double minBalance){
            setBalance(minBalance);
        }

        public void rateOfInterest(){
            double interestAmount=getBalance()*interest/100;
            deposit(interestAmount);
        }
    }


