package com.dependency.after;

public class SMSService implements Notifier {
    @Override
    public void send(String message) {
        // Code to send an SMS
        System.out.println("SMS sent: " + message);
    }
}
