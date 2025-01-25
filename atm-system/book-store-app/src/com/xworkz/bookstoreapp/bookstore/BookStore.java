package com.xworkz.bookstoreapp.bookstore;

import com.xworkz.bookstoreapp.charts.Charts;
import javafx.scene.chart.Chart;

public interface BookStore {

    boolean addCharts(Charts chart);
    void getAllCharts();

    boolean updateChartPriceById(String exestingType,int newNumOfPic);

    double getChartByName(String exestingName);

    String[] getChartTypeByPrice(double exestingPrice);
    boolean deleteChart();

    }

