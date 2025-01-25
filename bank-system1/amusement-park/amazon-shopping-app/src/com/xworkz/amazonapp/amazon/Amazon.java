package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.products.Products;

public interface Amazon {

    boolean createProduct(Products products);
    void getProduct();
    boolean updatePriceById(double price,int id);
    boolean updateRatingsByProductName(String name,double ratings);
    String getProductNameById(int id);
    String getProductCategoryByName(String name);
    double getProductPriceByName(String name);
    double getProductRatingsByName(String name);

    }



