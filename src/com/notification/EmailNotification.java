package com.notification;

 interface Notification {
    void send(String recipient, String message);
    //new mofivcation line will not come
}
public class EmailNotification implements Notification {

    @Override
    public void send(String recipient, String message) {
        // Send email notification
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
