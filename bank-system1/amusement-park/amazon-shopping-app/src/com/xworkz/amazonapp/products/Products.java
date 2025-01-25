package com.xworkz.amazonapp.products;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString

public class Products {

    private int id;
    private String name;
    private double price;
    private String category;
    private double rating;

}
