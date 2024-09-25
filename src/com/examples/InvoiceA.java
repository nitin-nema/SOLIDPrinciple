package com.examples;

public class InvoiceA {
}

//Example for Single Responsibility Principle
class InvoiceA {
    private int amount;

    InvoiceA(int amount){
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    /*public void printInvoice(){
        System.out.println("Invoice amount" +  amount);
    }

    public void saveToDatabase(){
        System.out.println("Saving " + amount + "to DB");
    }*/

}

class PrintInvoice {

    public void printInvoice(int amount){
        System.out.println("Invoice amount" +  amount);
    }
}

class SaveToDatabase {

    public void saveToDatabase(int amount){
        System.out.println("Saving " + amount + "to DB");
    }
}

public class Demo {

    public static void main(String[] args){
        InvoiceA inv = new InvoiceA(100);

        PrintInvoice printInvoice = new PrintInvoice();
        printInvoice.printInvoice(inv);

        SaveToDatabase save = new SaveToDatabase();
        save.saveToDatabase(inv);



    }
}


