package com.xworkz.atmapp;

public class CanaraBank implements Card{
    @Override
    public void swipe() {
        System.out.println("Canara bank card swiped");
    }
}
