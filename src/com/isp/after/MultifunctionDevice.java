package com.isp.after;

public class MultifunctionDevice implements Printable, Scannable, Faxable {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        System.out.println("Faxing document: " + document);
    }
}
