package com.xworkz.atmapp;

public class SbiBank implements Card{
    @Override
    public void swipe() {
        System.out.println("Sbi bank card swiped");
    }
}
