package com.isp.after;

public class Scanner implements Scannable {
    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }
}
