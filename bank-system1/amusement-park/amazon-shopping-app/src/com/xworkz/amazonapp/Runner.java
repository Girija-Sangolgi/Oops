package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazonimpl.AmazonImpl;
import com.xworkz.amazonapp.products.Products;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        System.out.println("Main Started");

        Scanner scanner = new Scanner(System.in);
        Amazon amazon = new AmazonImpl();

        for(int index=0;index<2;index++){
            Products products =new Products();

            System.out.println("Enter Product id");
            int productId=scanner.nextInt();
            products.setId(productId);

            System.out.println("Enter product name");
            String productName =scanner.next();
            products.setName(productName);

            System.out.println("Enter Product Price");
            double productPrice = scanner.nextInt();
            products.setPrice(productPrice);


            System.out.println("Enter Product Category");
            String productCategory =scanner.next();
            products.setCategory(productCategory);


            System.out.println("Enter Product Ratings");
            double productRating =scanner.nextInt();
            products.setRating(productRating);


            boolean isadded =amazon.createProduct(products);
            System.out.println(isadded);

        }

        amazon.getProduct();

        amazon.updatePriceById(3440,23);
        amazon.getProduct();

        amazon.updateRatingsByProductName("Dove",4.5);
        amazon.getProduct();

        amazon.getProductNameById(2);
        amazon.getProductCategoryByName("dove");

        double as = amazon.getProductPriceByName("d");
        System.out.println(as);

        double add = amazon.getProductRatingsByName("dove");
        System.out.println(add);

        System.out.println("Main Ended");
    }
}
