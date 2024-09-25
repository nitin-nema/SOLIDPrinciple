package com.examples;

public class InventoryManagerB {
    private int stockLevel;

    public InventoryManagerB(int stockLevel) {
        this.stockLevel = stockLevel;
    }

    public void updateStockLevel(int quantity) {
        this.stockLevel += quantity;

        //Logic for sending notification
        if(this.stockLevel < 10){
            System.out.println("Stock is less...Notify to admin");
        }
    }

}


