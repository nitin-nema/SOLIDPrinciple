package com.isp.after;

public class Printer implements Printable {
    @Override
    public void print(String document) {
        System.out.println("Printing document: " + document);
    }
}
