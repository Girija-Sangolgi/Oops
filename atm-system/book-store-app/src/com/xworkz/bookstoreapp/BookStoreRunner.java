package com.xworkz.bookstoreapp;

import com.xworkz.bookstoreapp.bookstore.BookStore;
import com.xworkz.bookstoreapp.bookstoreimpl.BookStoreImpl;
import com.xworkz.bookstoreapp.charts.Charts;

import java.util.Scanner;

public class BookStoreRunner {
    public static void main(String[] args) {
        System.out.println("main started");
        Scanner scn = new Scanner(System.in);
        BookStore books =new BookStoreImpl();

        for (int index=0;index<2;index++){
            Charts charts = new Charts();
            System.out.println("Enter Chart Id");
            int id = scn.nextInt();
            charts.setChartId(id);
            System.out.println("Enter Chart Name");
            String name = scn.next();
            charts.setChartName(name);
            System.out.println("Enter the Type");
            String typ = scn.next();
            charts.setType(typ);
            System.out.println("Enter Chart Price");
            double price = scn.nextDouble();
            charts.setPrice(price);
            System.out.println("Enter Number of Picture");
            int pic = scn.nextInt();
            charts.setNoOfPic(pic);

            boolean isChartAdded = books.addCharts(charts);
            System.out.println("is chart added ="+isChartAdded);
        }

        books.getAllCharts();
        books.updateChartPriceById("Sticker",10);
        books.getAllCharts();

        double price =books.getChartByName("Animal");
        System.out.println("the price is = +price");

        System.out.println("main ended");
    }
}
