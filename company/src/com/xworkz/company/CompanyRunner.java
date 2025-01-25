package com.xworkz.company;

import com.xworkz.company.google.Google;

public class CompanyRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        Google google = new Google();
        google.toProvideServices();


        System.out.println("main ended");
    }
}
