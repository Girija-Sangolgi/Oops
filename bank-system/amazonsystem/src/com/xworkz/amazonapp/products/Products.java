package com.xworkz.amazonapp.products;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Products {

        private int id;
        private String name;
        private String brand;
        private double price;
        private String category;
        private double ratings;

    }
