package com.xworkz.amazonapp;

import com.xworkz.amazonapp.amazon.Amazon;
import com.xworkz.amazonapp.amazonimpl.AmazonImpl;
import com.xworkz.amazonapp.products.Products;

public class Runner {
    public static void main(String[] args) {
        System.out.println("main started");

        Products products = new Products();
        products.setId(1123);
        products.setName("Laptop");
        products.setBrand("dell");
        products.setRatings(4.5);
        products.setCategory("Things");
        products.setPrice(50000);

        Products product = new Products();
        product.setId(2345);
        product.setName("Mobile Phone");
        product.setBrand("Samsung");
        product.setRatings(4.5);
        product.setCategory("Things");
        product.setPrice(40000);

        Products product1 = new Products();
        product1.setId(8734);
        product1.setName("Hair Dryer");
        product1.setBrand("Samsung");
        product1.setRatings(4.6);
        product1.setCategory("THings");
        product1.setPrice(4000);

        Products product2 = new Products();
        product2.setId(3456);
        product2.setName("Earbuds");
        product2.setBrand("Boat");
        product2.setRatings(4.0);
        product2.setCategory("Things");
        product2.setPrice(8000);

        Products product3 = new Products();
        product3.setId(5678);
        product3.setName("Mobile Back Case");
        product3.setBrand("Samsung");
        product3.setRatings(4.0);
        product3.setCategory("Things");
        product3.setPrice(399.00);

        Products product4 = new Products();
        product4.setId(9812);
        product4.setName("Saree");
        product4.setBrand("C J Enterprice");
        product4.setRatings(4.8);
        product4.setCategory("Cloth");
        product4.setPrice(1000);

        Products product5 = new Products();
        product5.setId(6784);
        product5.setName("College Bag");
        product5.setBrand("Irmao");
        product5.setRatings(4.5);
        product5.setCategory("Material");
        product5.setPrice(400.00);

        Products product6 = new Products();
        product6.setId(5642);
        product6.setName("earrings");
        product6.setBrand("Estele");
        product6.setRatings(4.5);
        product6.setCategory("Jewellery");
        product6.setPrice(408);

        Products product7 = new Products();
        product7.setId(7890);
        product7.setName("Kurta Set");
        product7.setBrand("Klosia");
        product7.setRatings(4.5);
        product7.setCategory("Cloth");
        product7.setPrice(549);

        Products product8 = new Products();
        product.setId(2345);
        product.setName("Mobile Phone");
        product.setBrand("Samsung");
        product.setRatings(4.5);
        product.setCategory("Water Proof");
        product.setPrice(40000);

        Amazon amazon = new AmazonImpl();
        amazon.addProducts(products);
        amazon.addProducts(product);
        amazon.addProducts(product1);
        amazon.addProducts(product2);
        amazon.addProducts(product3);
        amazon.addProducts(product4);
        amazon.addProducts(product5);
        amazon.addProducts(product6);
        amazon.addProducts(product7);
        amazon.addProducts(product8);

        amazon.getAllProducts();

       // amazon.getProductByName("Laptop");
        amazon.getProductById(5678);
       // amazon.getPriceById(5678);
        amazon.getProductNameBYCategory("Things");

        amazon.getAllProducts();
        amazon.updateProductRatingsByName(5.0,"Kurta Set");
        amazon.updateNameByBrand("Air Conditioner","Samsung");
        amazon.getAllProducts();
        System.out.println("main ended");
    }

    Object[] obj = new Customer[2];
    Customer customer = new Customer();


}
