package com.notification;

public class Main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();

        // Use existing notifications
        notificationService.sendNotification("email", "user@example.com", "Hello via email!");
        notificationService.sendNotification("sms", "123-456-7890", "Hello via SMS!");

        // Adding new notification type
        notificationService.registerNotification("push", new PushNotification());
        notificationService.sendNotification("push", "user@example.com", "Hello via push notification!");
    }
}
