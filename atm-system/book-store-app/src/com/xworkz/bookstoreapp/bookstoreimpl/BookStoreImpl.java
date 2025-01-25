package com.xworkz.bookstoreapp.bookstoreimpl;

import com.xworkz.bookstoreapp.bookstore.BookStore;
import com.xworkz.bookstoreapp.charts.Charts;

public class BookStoreImpl implements BookStore {

    Charts chart[] = new Charts[3];
    int index;

    @Override
    public boolean addCharts(Charts chart) {
        System.out.println("Add Chart Started");
        boolean isChartAdded = false;
        if (chart != null) {
            if (chart.getChartName() != null) {
                this.chart[index] = chart;
                isChartAdded = true;
            } else System.out.println("Chart Not Found");
        } else System.out.println("Chart Should not be null");
        System.out.println("Add Chart Ended");
        return isChartAdded;
    }

    @Override
    public void getAllCharts() {
        System.out.println("Get chart started");
        for (Charts chart : chart) {
            System.out.println(chart);
        }
        System.out.println("Get chart ended");
    }

    @Override
    public boolean updateChartPriceById(String exestingType, int newNumOfPic) {
        System.out.println("update chart price started");
        boolean isChartUpdated = false;
        for (int index = 0; index < this.chart.length; index++) {
            if (this.chart[index].getType() == exestingType) {
                isChartUpdated = true;
            }


            System.out.println("update chart price ended");

        }
        return isChartUpdated;
    }

    @Override
    public double getChartByName(String exestingName) {
        return 0;
    }

    @Override
    public String[] getChartTypeByPrice(double exestingPrice) {
        return new String[0];
    }

    @Override
    public boolean deleteChart() {
        return false;
    }
}
