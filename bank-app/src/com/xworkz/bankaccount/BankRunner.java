package com.xworkz.bankaccount;

import com.xworkz.bankaccount.sbiaccount.SbiAccount;
import com.xworkz.bankaccount.unionaccount.UnionAccount;

    public class BankRunner {
        public static void main(String[] args) {
            System.out.println("main started");

            UnionAccount unionaccount = new UnionAccount();
            unionaccount.deposit(50000);
            System.out.println(unionaccount.getBalance());
            unionaccount.withDraw(5000);
            System.out.println(unionaccount.getBalance());
            unionaccount.rateOfInterest();
            System.out.println(unionaccount.getBalance());

            SbiAccount sbiAccount = new SbiAccount();
            System.out.println(sbiAccount.getBalance());
            sbiAccount.deposit(10000);
            System.out.println(sbiAccount.getBalance());
            sbiAccount.withDraw(3000);
            System.out.println(sbiAccount.getBalance());
            sbiAccount.rateOfInterest();
            System.out.println(sbiAccount.getBalance());

            System.out.println("main ended");
        }
    }

