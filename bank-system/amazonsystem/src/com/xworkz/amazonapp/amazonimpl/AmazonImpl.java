package com.xworkz.amazonapp.amazonimpl;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.products.Products;

public class AmazonImpl implements Amazon {

    Products products[] = new Products[10];
    int index;

    @Override
    public boolean addProducts(Products products) {
       //System.out.println("addProducts started");
        boolean isProductsAdded = false;
        if (products != null) {
            this.products[index++] = products;
            isProductsAdded = true;
        }
       // System.out.println("addProducts Ended");
        return isProductsAdded;
    }

    @Override
    public void getAllProducts() {
        System.out.println("Fetching all the Detalis of Products.....");
        for (Products products1:products){
            System.out.println(products1);
        }
    }

    @Override
    public String getProductNameBYCategory(String Category) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getCategory().equals(Category));
            return (this.products[index].getName());
        }
        return "productName";
    }

    @Override
    public double getProductRatingsByName(String name) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name)){
                return (this.products[index].getRatings());
            }
        }
        return 0.0;
    }

    @Override
    public double getPriceById(int id){
        System.out.println("getPriceById started");
        for(index=0;index<products.length;index++){
            if(this.products[index].getId()==id){
                System.out.println(this.products[index].getPrice());
            }
        }
        System.out.println("getPriceById ended");
        return id;
    }

    @Override
    public String getBrandByName(String name) {
        System.out.println("getBrandByName started");
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name));
            return (this.products[index].getBrand());
        }
        System.out.println("getBrandByName ended");
        return "brand";
    }

    @Override
    public String getProductByRatings(double ratings) {
        System.out.println("getProductByRatings started");
        for(index=0;index<products.length;index++){
            if(this.products[index].getRatings()==(ratings));
        }
        System.out.println("getProductByRatings ended");
        return "product";
    }

    @Override
    public String getProductById(int id) {
        System.out.println("getProductById started");
        for(index=0;index<products.length;index++){
            if(this.products[index].getId()==(id));
        }
        System.out.println("getProductById ended");
        return "product";
    }

    @Override
    public String getProductByCategory(String category) {
        System.out.println("getProductCategory started");
        for(index=0;index<products.length;index++){
            if(this.products[index].getCategory().equals(category));
        }
        System.out.println("getProductCategory ended");
        return "product";
    }

    @Override
    public String getProductByName(String name) {
        System.out.println("getProductByName started");
        for (index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name));
        }
        System.out.println("getProductByName ended");
        return "product";
    }

    @Override
    public boolean updateProductRatingsByName(double updatedRatings, String name) {
        System.out.println("updateProductRatingsByName started");
        boolean isProductRatingUpdated = false;
        //for (index = 0; index < products.length; index++) {
            if (this.products[index].getName().equals(name)) {
                this.products[index].setRatings(updatedRatings);
            isProductRatingUpdated = true;
        }

        System.out.println("updateProductRatingsByName ended");
        return isProductRatingUpdated;
    }

    @Override
    public boolean updateNameByBrand(String updatedName, String brand) {
        System.out.println("updateNameByBrand started");
        boolean isNameUpdated=false;
        for(index=0;index<products.length;index++){
           // if(this.products[index].getBrand().equals(brand));
            this.products[index].setName(updatedName);
        }
        System.out.println("updateNameByBrand ended");
        return isNameUpdated;
    }

    @Override
    public boolean updatePriceByName(double updatedPrice, String name) {
        System.out.println("updatePriceByName started");
        boolean isPriceUpdated=false;
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name)){
                this.products[index].setPrice(updatedPrice);
                isPriceUpdated=true;
            }
        }
        System.out.println("updatePriceByName ended");
        return isPriceUpdated;
    }

    @Override
    public boolean updateNameById(String updatedName, int id) {
        System.out.println("updateNameById started");
        boolean isNameUpdated=false;
        for (index=0;index<products.length;index++){
            if(this.products[index].getId()==(id));
            this.products[index].setName(updatedName);
            isNameUpdated=true;
        }
        System.out.println("updateNameById ended");
        return isNameUpdated;
    }
}