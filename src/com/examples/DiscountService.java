package com.examples;

public class DiscountService {

    public double calcualteDiscount(String custromerType, double totalAmount){
        if(custromerType.equals("Regualar")){
            return totalAmount * 0.05;
        } else if(custromerType.equals("Preiumium")){
            return totalAmount * 0.10;
        }
        //no more modification in this class
        return 0;
    }
}

//OCP