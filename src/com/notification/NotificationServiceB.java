package com.notification;

public class NotificationServiceB {

    public void sendEmail(String recipient, String message) {
        // Send email notification
        System.out.println("Sending email to " + recipient + ": " + message);
    }

    public void sendSMS(String recipient, String message) {
        // Send SMS notification
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }

    public void sendNotification(String type, String recipient, String message) {
        if (type.equals("email")) {
            sendEmail(recipient, message);
        } else if (type.equals("sms")) {
            sendSMS(recipient, message);
        }
    }
}
