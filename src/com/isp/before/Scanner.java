package com.isp.before;

public class Scanner implements Device {
    @Override
    public void print(String document) {
        throw new UnsupportedOperationException("Scanner does not support printing");
    }

    @Override
    public void scan(String document) {
        System.out.println("Scanning document: " + document);
    }

    @Override
    public void fax(String document) {
        throw new UnsupportedOperationException("Scanner does not support faxing");
    }
}
