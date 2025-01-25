package com.xworkz.amusementpark;

import com.xworkz.amusementpark.esselworld.EsselWorld;

public class AmusementRunner {
    public static void main(String[] args) {
        System.out.println("main started");

        EsselWorld esselWorld = new EsselWorld();
        esselWorld.toEnjoy();

        System.out.println("main ended");
    }
}
