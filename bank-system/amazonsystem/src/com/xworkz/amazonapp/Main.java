package com.xworkz.amazonapp;

public class Main {

    public static void main(String[] args) {

        Object[] obj = new Customer[2];

        Customer customer = new Customer();
        customer.setId(1);

        Customer customer1 = new Customer();
        customer1.setId(2);

        System.out.println(customer +  " " + customer1 );
    }
}
