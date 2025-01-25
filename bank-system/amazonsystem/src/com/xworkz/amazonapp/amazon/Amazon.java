package com.xworkz.amazonapp.amazon;

import com.xworkz.amazonapp.products.Products;

public interface Amazon {

    boolean addProducts(Products products);
    void getAllProducts();
    String getProductNameBYCategory(String Category);
    double getProductRatingsByName(String name);
    double getPriceById(int id);
    String getBrandByName(String name);
    String getProductByRatings(double ratings);
    String getProductById(int id);
    String getProductByCategory(String category);
    String getProductByName(String name);
    boolean updateProductRatingsByName(double updatedRatings,String name);
    boolean updateNameByBrand(String updatedName,String brand);
    boolean updatePriceByName(double updatedPrice,String name);
    boolean updateNameById(String updatedName,int id);

}
