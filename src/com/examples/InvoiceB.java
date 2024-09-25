package com.examples;

 class InvoiceB {
    private int amount;

    private InvoiceB(int amount){
        this.amount = amount;
    }

     public int getAmount() {
         return amount;
     }

     public void printInvoice(){
        System.out.println("Invoice amount" +  amount);
     }

     public void saveToDatabase(){
        System.out.println("Saving " + amount + "to DB");
     }
 }


