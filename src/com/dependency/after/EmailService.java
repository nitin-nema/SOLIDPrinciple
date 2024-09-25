package com.dependency.after;

public class EmailService implements Notifier {
    @Override
    public void send(String message) {
        // Code to send an email
        System.out.println("Email sent: " + message);
    }
}
