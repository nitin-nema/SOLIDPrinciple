package com.isp.before;

public class Printer implements Device {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }

    @Override
    public void scan(String document) {
        throw new UnsupportedOperationException("Printer does not support scanning");
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Printer does not support faxing");
    }
}
