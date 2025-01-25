package com.xworkz.bankaccount;

import com.xworkz.bankaccount.canarabank.CanaraBank;
import com.xworkz.bankaccount.punjabbank.PunjabBank;

public class BankRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        CanaraBank myAccount = new CanaraBank(1000);
                myAccount.deposit(50000);
        System.out.println(myAccount.getBalance());
        myAccount.withDraw(5000);
        System.out.println(myAccount.getBalance());
        myAccount.rateOfInterest();
        System.out.println(myAccount.getBalance());

       /* PunjabBank punjabBank = new PunjabBank();
        System.out.println(punjabBank.getBalance());
        punjabBank.deposit(10000);
        System.out.println(punjabBank.getBalance());
        punjabBank.withDraw(3000);
        System.out.println(punjabBank.getBalance());
        punjabBank.rateOfInterest();
        System.out.println(punjabBank.getBalance());*/

        PunjabBank papasAccount = new PunjabBank();
        myAccount.transfer(papasAccount,3000);
        System.out.println("the Closing amount is:"+papasAccount.getBalance());

        System.out.println("main ended");

        CanaraBank sinchanasAccount = new CanaraBank(1000);
        myAccount.transfer(sinchanasAccount,5000);

        System.out.println("the Closing amount is :"+sinchanasAccount.getBalance());


        System.out.println("the Closing amount is :"+myAccount.getBalance());


        System.out.println("the Closing amount is :"+sinchanasAccount.getBalance());
    }
}
