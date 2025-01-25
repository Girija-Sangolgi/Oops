package com.xworkz.bankaccount.bankaccount;

public class BankAccount {

        private double balance;


        public void setBalance(double balance) {
            this.balance = balance;
        }

        public double getBalance() {
            return balance;
        }

        public void deposit(double amount) {
            System.out.println("deposit started");
            if (amount > 0) {
                balance = balance + amount;
            } else System.out.println("Please Provide valid amount....");

            System.out.println("deposit ended");
        }

        public void withDraw(double amount){
            System.out.println("withDraw started");
            if(amount<=balance){
                balance=balance-amount;
            }

            System.out.println("end of withDraw");
        }
    }

