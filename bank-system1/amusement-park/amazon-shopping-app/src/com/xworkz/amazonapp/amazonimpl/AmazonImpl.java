package com.xworkz.amazonapp.amazonimpl;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.products.Products;

public class AmazonImpl implements Amazon {

    Products products[] = new Products[2];
    int index;

    @Override
    public boolean createProduct(Products products) {
        System.out.println("Create Started");
        boolean isProductCreated=false;
        if(products!=null){
            if(products.getName()!=null){
                this.products[index++]=products;
                isProductCreated=true;
            }
        }
        System.out.println("Create Ended");
        return isProductCreated;
    }

    @Override
    public void getProduct() {
        for(Products products1:products){
            System.out.println(products1);
        }
    }

    @Override
    public boolean updatePriceById(double price, int id) {
        System.out.println("Update Started");
        boolean isPriceByIdUpdated=false;
        for(index=0; index<products.length;index++){
            if(this.products[index].getId()==id){
                this.products[index].setPrice(price);
                isPriceByIdUpdated=true;
            }
        }
        System.out.println("Update Ended");
        return isPriceByIdUpdated;
    }

    @Override
    public boolean updateRatingsByProductName(String name, double ratings) {
        System.out.println("update rating started");
        boolean isRatingUpdated=false;
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name)){
                this.products[index].setRating(ratings);
                isRatingUpdated=true;
            }
        }
        System.out.println("update rating ended");
        return isRatingUpdated;
    }

    @Override
    public String getProductNameById(int id) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getId()==id){
                System.out.println(this.products[index].getName());
            }
        }
        return "name";
    }

    @Override
    public String getProductCategoryByName(String name) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name));
        }
        return "category";
    }

    @Override
    public double getProductPriceByName(String name) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name)){
            }
        }
        return 0.0;
    }

    @Override
    public double getProductRatingsByName(String name) {
        for(index=0;index<products.length;index++){
            if(this.products[index].getName().equals(name)){
                return (this.products[index].getRating());
            }
        }
        return 0.0;
    }
}