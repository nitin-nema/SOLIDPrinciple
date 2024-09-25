package com.notification;

import java.util.HashMap;
import java.util.Map;

public class NotificationService {
    private final Map<String, Notification> notificationMap = new HashMap<>();

    public NotificationService() {
        // Register default notifications
        notificationMap.put("email", new EmailNotification());
        notificationMap.put("sms", new SMSNotification());
    }

    public void registerNotification(String type, Notification notification) {
        notificationMap.put(type, notification);
    }

    public void sendNotification(String type, String recipient, String message) {
        Notification notification = notificationMap.get(type);
        if (notification != null) {
            notification.send(recipient, message);
        } else {
            System.out.println("Notification type not supported.");
        }
    }
}
