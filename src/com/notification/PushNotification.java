package com.notification;

public class PushNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        // Send push notification
        System.out.println("Sending push notification to " + recipient + ": " + message);
    }
}
