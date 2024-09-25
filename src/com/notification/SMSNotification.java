package com.notification;

public class SMSNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        // Send SMS notification
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
