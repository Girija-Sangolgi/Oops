package com.xworkz.bookstoreapp.charts;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import java.util.PrimitiveIterator;
@Getter
@Setter
@ToString
@NoArgsConstructor
public class Charts {

    private Integer chartId;
    private String chartName;
    private String type;
    private double price;
    private int noOfPic;
}
